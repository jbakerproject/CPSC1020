/**
   This class analyzes the distribution of the last digit of values
   from a sequence.
*/
public class LastDigitDistribution
{
   private int[] counters;

   /**
      Constructs a distribution whose counters are set to zero.
   */
   public LastDigitDistribution()
   {
      counters = new int[10];
   }

   /**
      Processes values from this sequence.
      @param mySequence the sequence from which to obtain the values
      @param valuesToProcess the number of values to process
   */
   public void process(MySequence MySequence)
   {
      for (int i = 1;MySequence.hasNext(); i++)
      {
         int value = MySequence.next();
         int lastDigit = value % 10;
         counters[lastDigit]++;
      }
   }

   /**
      Displays the counter values of this distribution.
   */
   public void display()
   {
      for (int i = 0; i < counters.length; i++)
      {
         System.out.println(i + ": " + counters[i]);
      }
   }
}
