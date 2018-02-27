package lesson1;

import java.util.ArrayList;

public class question {
	private String question = "Целочисленный тип?";
	
	private String option1 = "float";
	private String option2 = "String";
	private String option3 = "int";
	
	private ArrayList<String> AnswerList = new ArrayList<String>();
	
	public question()
	{
		AnswerList.add("float");
		AnswerList.add("String");
		AnswerList.add("int");
	}
	
	private int RightAnswer = 3;
	
	public void ask()
	{
		System.out.println(question);
		for(int i = 0; i < AnswerList.size(); i++)
		{
			System.out.println(AnswerList.get(i));
		}
		
		for (String str: AnswerList)
		{
			System.out.println(str);
		}
	}
	
	public boolean answer(int index)
	{
		if (index == RightAnswer)
			return true;
		else
			return false;
	}
	
}
