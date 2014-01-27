public class Lab1
{
  public static void main(String[] args)
  {
    int drinks = 18;
    int appetizers = 12;
    int entrees = 27;
    int dessert = 10;
// Your code starts here 
    int meal = drinks + appetizers + entrees + dessert;
    double mealAndTax = meal * 1.08;
    System.out.println(mealAndTax);
    double tip = meal * .2;
    System.out.println(tip);
    double total = tip + mealAndTax;
    System.out.println (total);
    double totalPerPerson = total/3;
    System.out.println (totalPerPerson);
// Your code ends here
  }
}
