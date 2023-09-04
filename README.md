# Googlesearch

markdown
Copy code
# Selenium Google Search Automation

This project demonstrates Selenium WebDriver automation for performing Google searches using Java and TestNG.

## Prerequisites

Before running the Selenium tests, ensure you have the following prerequisites installed:

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Chrome WebDriver](https://sites.google.com/chromium.org/driver/)

## Getting Started

1. Clone the repository:

   ```bash
   git clone <repository-url>
Import the project into your favorite Java IDE (e.g., Eclipse, IntelliJ IDEA).

Configure the Chrome WebDriver path:

Download the appropriate Chrome WebDriver version compatible with your Chrome browser.
Update the WebDriver path in the GoogleSearch.java file:
java
Copy code
System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
Install the TestNG plugin for your IDE if it's not already installed.

Usage
Open the GoogleSearch.java file in your IDE.

Modify the test script as needed or keep it as is. The script performs the following steps:

Opens Google (https://www.google.com)
Searches for "what is the meaning of power"
Clears the search input
Searches for "foodics"
Scrolls down to load more results
Clicks the "Next" button to go to the next page of results
Right-click the OpenBrowser method and select "Run" to execute the test.

View the test results in your IDE.

Contributing
If you want to contribute to this project, feel free to open an issue or submit a pull request.

License
This project is licensed under the MIT License - see the LICENSE.md file for details.

Contact
If you have any questions or need assistance, please feel free to contact Your Name.

Acknowledgments
Selenium WebDriver
TestNG
