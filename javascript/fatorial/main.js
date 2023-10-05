function fatorial(n) {
  if (n == 0) return 1;
  return n * fatorial(n - 1);
}

result = fatorial(20);
console.log(`fatorial de 20 é ${result}`);
