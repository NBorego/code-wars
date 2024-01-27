namespace Solution
{
  public class SolutionClass
  {
    public static string EvenOrOdd(int number) => (number % 2 == 0) ? "Even" : "Odd";

    static void Main(string[] args)
    {
      Console.WriteLine(EvenOrOdd(2));
    }
  }


}
