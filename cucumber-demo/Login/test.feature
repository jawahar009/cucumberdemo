# Basically telling name of application
Feature: Login Application
Scenario: To test login application with valid conditions
# pre-conditions should be provided in given tag and colan is not provided in this tag
Given i should have valid URL and be present in the login page


# condition<what am going to test>
When Enter valid user name and password  and click submit
#post-condition
Then Login should be successfull