import java.util.*;
public class studentgrading {

  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
      System.out.println ("Enter total number of subjects");
    int subjects = sc.nextInt ();
    // total number of subjects
    int[] marks = new int[subjects];	//marks in every subject;
    float total = 0;
    float avg = 0;
    for (int i = 0; i < subjects; i++)
      {
	System.out.println ("marks of subject" + (i + 1) + ":");
	marks[i] = sc.nextInt ();
	total = total + marks[i];
      }
    System.out.println ("Total marks attained :" + total);

    avg = total / subjects;
    System.out.println ("Student's average percentage is :" + avg + "%");

    if (avg >= 90)
      {
	System.out.println ("O+");
      }
    else if (avg >= 80 && avg <= 90)
      {
	System.out.println ("Grade given to the student is : A");
      }
    else if (avg >= 70 && avg <= 80)
      {
	System.out.println ("Grade given to the student is : B");
      }
    else if (avg >= 60 && avg <= 70)
      {
	System.out.println ("Grade given to the student is : C");

      }
    else if (avg >= 50 && avg <= 60)
      {
	System.out.println ("Grade given to the student is : D");

      }
    else if (avg >= 40 && avg <= 50)
      {
	System.out.println ("Grade given to the student is : E");
      }
    else
      {
	System.out.println ("Grade given to the student is : F");
      }
    }
  }

