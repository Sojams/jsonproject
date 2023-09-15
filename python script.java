from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.by import By

# Initialize the Chrome WebDriver

from selenium import webdriver

# Replace with the URL of the web application you want to automate
#url = "https://example.com"
#driver.get(url)

driver=webdriver.chrome()
driver.get("https://opensource-demo.orangehrmlive.com/")

# Replace 'your_username' and 'your_password' with your actual credentials
#username_field.send_keys("your_username")
#password_field.send_keys("your_password")

driver.find_elements_by_name("txtUsername").send_keys("admin")
driver.find_elements_by_id("txtPassword").send_keys("admin123")

# Perform the login action by clicking the login button

driver.find_elements_by_id("btnLogin").click()

# Optionally, you can add a delay to see the result before closing the browser
import time
time.sleep(5) # Sleep for 5 seconds

# Close the browser
driver.quit()	
