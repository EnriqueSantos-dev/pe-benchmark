const fs = require("node:fs");
const readline = require("node:readline");

const rl = readline.createInterface({
  input: fs.createReadStream("data/example.txt"),
  crlfDelay: Infinity,
});

rl.on("line", (line) => {
  console.log(line);
});
