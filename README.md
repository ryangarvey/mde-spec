# website-spec
<b>website-spec</b> is an E2E testing framework built upon JavaScript using Selenium. The language is designed to help improve the testing process when designing websites.

# Prerequisites 
To begin using website-spec, the following must be installed on your machine:
<ol>
  <li> Eclipse IDE with modelling packages </li>
  <li> ChromeDriver or your own preferred browser's driver (Chrome is recommended) </li>
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

## Installing Mocha

In order for **website-spec** to function correctly, Mocha must be installed globally using the command below.

```node
npm install --g mocha
```

## Creating an External Tool Configuration

When using **website-spec** inside your runtime eclipse, an external tool will need to be created in order to run the language successfully.

<ol>
  <li>Go to External Tools -> External Tool Configurations</li>
  <li>Click on Program and click New Launch Configuration from the top left corner</li>
  <li>Locate where Mocha has been installed, this can be done by opening a command prompt and typing "where mocha"</li>
  <li>In location, paste the folder location and include the file "mocha.cmd" on the end, so it should look like "C:\path\to\mocha\mocha.cmd"</li>
  <li>In working directory, paste "${container_loc}", and in arguments, paste "${resource_name}"</li>
  <li>Press Apply</li>
</ol>

You should now be able to highlight **run.js** in your _\src-gen_ folder and the test file should run.


