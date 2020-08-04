from bs4 import BeautifulSoup
import requests
import smtplib, ssl

def send_email(product):
    smtp_server = "smtp.gmail.com"
    port = 587
    sender_mails = "bilalcelebi23@gmail.com"
    password = "rwzxwqiwlznjushs"

    safety  = ssl.create_default_context()

    try:
        server = smtplib.SMTP(smtp_server,port)
        server.ehlo()
        server.starttls(context=safety)
        server.ehlo()
        server.login(sender_mails,password)

        receiver_email = "bilal.celebi.01@outlook.com"
        message_subject = "Urunun Geldi"
        message_body = "Linke Tikla, Alisverisine Basla : {}".format(product)
        message = """\
From:{}
To:{}
Subject:{}\n
{}
        """.format(sender_mails,receiver_email,message_subject,message_body)
        server.sendmail(sender_mails,receiver_email,message)
        print("Mail Gonderildi")
        server.quit
    except Exception as e:
        print(e)

url = "https://www.amazon.com.tr/s?k=kamera&__mk_tr_TR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&ref=nb_sb_noss_2"

header = {'User-Agent':"Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/84.0.4147.105 Safari/537.36"}

page = requests.get(url,headers=header)

soup = BeautifulSoup(page.content,"html.parser")

prices = soup.find_all("span", class_="a-price-whole")
links = soup.find_all("a",class_="a-link-normal a-text-normal", href=True)

i = 0
while i < len(prices):
    price = prices[i]
    link = links[i]
    real_price = float(price.contents[0])
    real_link = link['href']
    product_link = "https://www.amazon.com.tr{}".format(real_link)

    if(real_price < 3000):
        send_email(product_link)
    i+=1
