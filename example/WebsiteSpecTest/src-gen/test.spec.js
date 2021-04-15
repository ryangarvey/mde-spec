const {Builder, By, until} = require('selenium-webdriver');
const test = require('selenium-webdriver/testing');
const assert = require('assert');
	
describe('test.spec', function() {
  let driver;
	
  before(async () => {
    const d = await new Builder().forBrowser('chrome').build();
    	driver = d;
  });
  
  it('test', async () => {
    await driver.get("https://www.google.com/")
    await driver.findElement(By.name('this button here')).click()
    await driver.findElement(By.name('another thing'))
    await driver.findElement(By.name('another thing')).getText()
				       .then(textValue => {
 assert.equal(textValue , "something here?")});
    await driver.findElement(By.name('another thing')).sendKeys('Typing into a box')
    await driver.sleep(3000)
    await driver.findElement(By.name('card-panel-store'))
    await driver.findElement(By.name('[data-test=stores] label'))
    await driver.findElement(By.name('something'))
    await driver.findElement(By.name('.preview-value'))
}).timeout(10000);
	
  after(() => {
    return driver.quit();
  });
 });
