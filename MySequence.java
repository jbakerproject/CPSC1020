
public class MySequence {
// populations of atlanta, nashville, memphis, and chattanooga
private int[] cityPopulations = {486290, 691243, 652236, 179139};
private static int sizeCount = 0;
public boolean hasNext()
{
	if(sizeCount > cityPopulations.length -1)
		return false;
	else 
		return true;
}
public int next()
{
	int temp = cityPopulations[sizeCount];
	sizeCount++;
	return temp;
}
}
