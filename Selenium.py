# -*- coding: utf-8 -*-
"""
Spyder Editor

Open CMD in Anaconda and type pip install selenium
"""
from selenium import webdriver

driver = webdriver.Chrome('C:/Users/Mike/Desktop/JAVA/chromedriver.exe')
driver.get("https://www.python.org")
print(driver.title)
