   General Check List:
1.Execute these scenarios with different user roles e.g. admin user, guest user.
2.For web applications these scenarios should be tested on multiple browsers: IE, FF, Chrome, and Safari with versions approved by client.
3.Test with different screen resolutions: 1024 x 768, 1280 x 1024, etc.
4.Application should be tested on variety of displays: LCD, CRT, Notebooks, Tablets, and Mobile phones.
5.Test application on different platforms: Windows, Mac operating systems.

   Functional Test Scenarios for website : https://automation.herolo.co.il/ 
   
- URL OF website is valid in all pages
- Titles of all pages are clear
- Test HTML and CSS to ensure that search engines can crawl your site easily
- All the links are working correctly and make sure there are no broken links
- Text on all pages for spelling and grammatical errors is correct
- Pagination buttons, "left and right arrow" page in Gallery "עבודות לדוגמה" navigate to next and previous page
- Pagination buttons,  in Gallery "כמה מהלקוחות שלנו" navigate to next and previous page
- Forms are working as expected (MainPageTest) :
- Pop-up windows are performed  
- Icons(Facebook,Whatsup,Linkedin) on the footer navigate to an appropriate page.  

Test Scenario: Form (רוצים לשמוע עוד?) are working as expected (MainPageTest) :
POSITIVE SCENARIO:
      Input fields with valid characters and numbers
      Input fields with valid characters in hebrew
      Input fields with capital characters 
      Input fields with capital characters and numbers
NEGATIVE SCENARIO:
      Input fields with invalid characters. Proper validation message should appear
      All error messages should be displayed 
      Input fields should be checked for min(empty) field value
      Input fields should be checked for max field value
      Check all input fields for special characters
      Button "Submit" is enabled 

Test Scenario: Pagination Gallery: MainPageTest " עבודות לדוגמה"
     Check right button is clickable
     Check left  button is clickable

Bugs:
1. Nothing happens when the image is clicked in Gallery "עבודות לדוגמה". 
Choosing What Happens : image should open to their full size or redirect to picture's site?
  
2. Nothing happens when the image is clicked in Gallery "כמה מהלקוחות שלנו". 
Choosing What Happens : image should open to their full size or redirect to picture's site?
Images are blurry and fuzzy.

