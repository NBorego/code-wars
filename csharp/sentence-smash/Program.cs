public class Kata
{
  public static string Smash(string[] words) => string.Join(" ", words);

  static void Main(string[] args)
  {
    Console.Write(Smash(new string[] { "hello", "world", "this", "is", "great" }));
  }
}


