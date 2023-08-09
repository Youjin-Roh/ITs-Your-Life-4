package day_04;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionExam {
	public static void main(String[] args) {
		//로또 번호 생성기
		//List 타입 : int[] => integer 저장 타입 
		ArrayList<Integer> lottoList = new ArrayList<Integer>();
		HashSet<Integer> lottoSet = new HashSet<Integer>();
		
		for (int i = 0; i < 6; i++) {
			int r = (int)(Math.random()*45+1);
			//if(lottoSet.contains(r))
			//	continue;
			lottoSet.add(r);
			lottoList.add(r);			
		}
		System.out.println(lottoList);
		System.out.println(lottoSet);
		System.out.println(lottoList.size());
		System.out.println(lottoSet.size());

		
	}//main
}//class
