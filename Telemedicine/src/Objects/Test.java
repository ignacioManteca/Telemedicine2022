package Objects;

import java.util.ArrayList;
import java.util.Date;

public class Test {
	public Date date = new Date();
	public int frequence;
	public String signal;
	public ArrayList <Integer> sequence= new ArrayList<Integer>();
	public ArrayList <Integer> value = new ArrayList<Integer>();
	public ArrayList <String> column = new ArrayList <String>();
	
	public String getSignal() {
		return signal;
	}


	public void setSignal(String signal) {
		this.signal = signal;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public int getFrequence() {
		return frequence;
	}


	public void setFrequence(int frequence) {
		this.frequence = frequence;
	}


	public ArrayList<Integer> getSeq() {
		return sequence;
	}


	public void setSeq(ArrayList<Integer> seq) {
		this.sequence = seq;
	}


	public ArrayList<Integer> getValue() {
		return value;
	}


	public void setValue(ArrayList<Integer> value) {
		this.value = value;
	}

	
	public void printList(ArrayList<Integer> a,ArrayList<Integer> b) {
		for(int i=0;i<a.size();i++) {
		column.add("seq: " + a.get(i)+ " value: " +b.get(i)+ "\n"); 
		}
	}


	@Override
	public String toString() {
		return "Test \n[date=" + date + "\n frequence=" + frequence + "\n signal = " + signal +"\n column=" + column + "]";
	}


	
	
	
}
