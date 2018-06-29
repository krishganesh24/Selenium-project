Feature: Login into Testleaf Application
Scenario Outline: Create Lead 
#Given Invoke LeafTap ApplicationCL 
And Enter the UsernameCL <userName> 
And Enter the PasswordCL <passWord>
And Click on Login Button 
And Click on CRMSFA link
And Click on Leadslink
And Click on CreateLead link
And Enter the Company NameCL <companyName>
And Enter the First NameCL <firstName>
And Enter the Last NameCL <lastName>
And Click on Create Lead Button
Then Verify the Page Name 
Examples:
|userName|passWord|companyName|firstName|lastName|
|DemoSalesManager|crmsfa|TCS|Dhineshkumar|R|


 