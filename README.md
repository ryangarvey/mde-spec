# website-spec
<b>website-spec</b> is an E2E testing framework built upon JavaScript using Selenium. The language is designed to help improve the testing process when designing websites.

# Prerequisites 
To begin using website-spec, the following must be installed on your machine:
<ol>
  <li> Eclipse IDE with modelling packages </li>
  <li> ChromeDriver or your own preferred browser's driver (Chrome is recommended) </li>
  <li> SeleniumDriver </li>
  <li> Mocha </li>
</ol>



## Installing ChromeDriver
In order to use website-spec, a web driver is required in order for automated testing to work. For this installation guide, ChromeDriver will be used. However, you can use whichever browser you deem necessary.

<ol>
<li> To check your browser version, press the three dots in the upper right corner of your browser, and then press Settings. On the left hand side of the screen you should see a menu. Click on About Chrome. Your version will be displayed in this page. </li>
<li> Navigate to <a href="https://chromedriver.chromium.org/">this site</a> and download the version of ChromeDriver corresponding to your browser's version. </li>
<li> Upon completion of the download, place the driver's file in a location on your local disk. </li>
<li> Add this location to your system path. This can be done on windows by opening the start menu, and typing <i>Environment Variables</i>. Open the first result and press the Environment Variables button. From here you can locate the PATH variable and add a rule to it. </li>
</ol>

Once these steps have been completed, ChromeDriver will be available to use on your computer. You can test this by opening a command prompt and typing <i>chromedriver</i> in the window.

## Installing Selenium Webdriver

You can easily install the Selenium Webdriver via Node, using the command below. 

```node
npm install --global selenium-webdriver
```
If you prefer to install the library as a project dependency, navigate to your **src-gen/** folder and issue the following command to the terminal.

```node
npm install --save-dev selenium-webdriver
```

## Installing Mocha

Much like Selenium Webdriver, the Mocha library can be installed using Node. Simply use the command below. 

```node
npm install --global mocha
```

Or, much like Selenium Webdriver, you can install Mocha inside the **src-gen/** folder.

```node
npm install --save-dev mocha
```