const process = require('child_process');

function outputCallback(error, stdout, stderr) {
	if (error) {
		console.error(`exec error: ${error}`);
		return;
	}
	console.log(`stdout: ${stdout}`);
	console.error(`stderr: ${stderr}`);
}

async function run() {
	await process.exec("npm install", (error, stdout, stderr) => outputCallback(error, stdout, stderr));
	
	process.exec("start cmd.exe /K test.spec.js", (error, stdout, stderr) => outputCallback(error, stdout, stderr));
}

run();
