namespace Solution
{
  class Kata
  {
    public static int find_it(int[] seq)
    {
      int even = 0;
      int quant = 0;

      foreach (var number in seq)
      {
        even = number;

        for (var i = 0; i < seq.Length; i++)
        {
          quant += seq[i] == number ? 1 : 0;
        }

        if (quant % 2 != 0) return number;

        quant = 0;
      }

      return 0;
    }

    static void Main(string[] args)
    {
      Console.WriteLine(find_it(new[] { 0, 1, 0, 1, 1 }));
    }
  }
}
