export class Challenge {
  solution(num: number): number {
    if (num <= 0) {
      return 0;
    }

    let mult: number[] = [];

    for (let i = 0; i < num; i++) {
      let MULTIPLE_OF_THREE = i % 3 === 0;
      let MULTIPLE_0F_FIVE = i % 5 === 0;

      if (MULTIPLE_OF_THREE || MULTIPLE_0F_FIVE) {
        mult.push(i);
      }
    }

    return mult.reduce((a: number, c: number) => a + c);
  }
}

let c = new Challenge();

console.log(c.solution(10));
