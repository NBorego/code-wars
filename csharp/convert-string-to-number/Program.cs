public class Kata
{
  public static int StringToNumber(String str) => int.Parse(str);

  static void Main(string[] args)
  {
    Console.WriteLine(StringToNumber("1234"));
  }
}
