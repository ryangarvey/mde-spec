Using Chrome

# Define test 1
Store url as "https://www.google.com/"

Open url
Click on "this button here"
Select 'another thing'
	Property text should be "something here?"
	Type "Typing into a box"
Sleep for 3 seconds 
Within "card-panel-store"
	Select '[data-test=stores] label'
		Store storeName as "something"
	Select element storeName
		!Class should not contain "disabled"
	Select element '.preview-value'
