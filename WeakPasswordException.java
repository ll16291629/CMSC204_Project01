//Programmer: Luke Lamborn

public class WeakPasswordException extends Exception
{
	public WeakPasswordException()
	{
		super("The password is OK but weak.");
		
	}
	public WeakPasswordException(String message)
	{
		super(message);
	}
}
