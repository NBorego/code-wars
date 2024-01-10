export function makeLooper(str: string): () => string {
  let index: number = 0;

  function changeIndex(): string {
    index >= str.length ? (index = 1) : index++;
    return str[index - 1];
  }

  return changeIndex;
}

const abc = makeLooper('abc');

console.log(abc());
console.log(abc());
console.log(abc());
console.log(abc());
