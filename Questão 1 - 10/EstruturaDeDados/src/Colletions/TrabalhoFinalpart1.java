package Colletions;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class TrabalhoFinalpart1 {
	private DefaultCategoryDataset ds = new DefaultCategoryDataset();
	public double linkedList() throws Exception {//completo
		LinkedList<String> LL = new LinkedList<String>();
		InputStreamReader stream = new InputStreamReader(getClass().getResourceAsStream("leipzig100k.txt"));
		BufferedReader reader = new BufferedReader(stream);
		String text = "";
		String line = reader.readLine(); 
		Stopwatch timer1 = new Stopwatch();//Aqui que começa a inserir na árvore!Começa o tempo de execução
		while (line!=null){
			for (String key : line.split(" ")) {
				if(!LL.contains(key))
					LL.add(key);
			    }
			line = reader.readLine();   
		}
		double k = timer1.elapsedTime();//Termina o tempo de execução k possui a diferença do incio com o fim 
		return k;
	}
	
	public double arrayList() throws Exception {//completo
		ArrayList<String> AL = new ArrayList<String>();
		InputStreamReader stream = new InputStreamReader(getClass().getResourceAsStream("leipzig100k.txt"));
		BufferedReader reader = new BufferedReader(stream);
		String text = "";
		String line = reader.readLine(); 
		Stopwatch timer1 = new Stopwatch();//Aqui que começa a inserir na árvore!Começa o tempo de execução
		while (line!=null){
			for (String key : line.split(" ")) {
				if(!AL.contains(key))
					AL.add(key);
			    }
			line = reader.readLine();   
		}
		double k = timer1.elapsedTime();//Termina o tempo de execução k possui a diferença do incio com o fim 
		return k;
	}
	
	public double hashSet() throws Exception {//completo
		HashSet<String> HS = new HashSet<String>();
		InputStreamReader stream = new InputStreamReader(getClass().getResourceAsStream("leipzig100k.txt"));
		BufferedReader reader = new BufferedReader(stream);
		String text = "";
		String line = reader.readLine(); 
		Stopwatch timer1 = new Stopwatch();//Aqui que começa a inserir na árvore!Começa o tempo de execução
		while (line!=null){
			for (String key : line.split(" ")) {
				if(!HS.contains(key))
					HS.add(key);
			    }
			line = reader.readLine();   
		}
		double k = timer1.elapsedTime();//Termina o tempo de execução k possui a diferença do incio com o fim 
		
		return k;
	}
	
	public double linkedHashSet() throws Exception {//completo
		LinkedHashSet<String> LHS = new LinkedHashSet<String>();
		InputStreamReader stream = new InputStreamReader(getClass().getResourceAsStream("leipzig100k.txt"));
		BufferedReader reader = new BufferedReader(stream);
		String text = "";
		String line = reader.readLine(); 
		int value=0;
		Stopwatch timer1 = new Stopwatch();//Aqui que começa a inserir na árvore!Começa o tempo de execução
		while (line!=null){
			for (String key : line.split(" ")) {
				if(!LHS.contains(key))
					LHS.add(key);
			    }
			line = reader.readLine();   
		}
		double k = timer1.elapsedTime();//Termina o tempo de execução k possui a diferença do incio com o fim 
		
		return k;
	}
	
	public double treeSet() throws Exception {//completo
		TreeSet<String> TS = new TreeSet<String>();
		InputStreamReader stream = new InputStreamReader(getClass().getResourceAsStream("leipzig100k.txt"));
		BufferedReader reader = new BufferedReader(stream);
		String text = "";
		String line = reader.readLine(); 
		Stopwatch timer1 = new Stopwatch();//Aqui que começa a inserir na árvore!Começa o tempo de execução
		while (line!=null){
			for (String key : line.split(" ")) {
				if(!TS.contains(key))
					TS.add(key);
			    }
			line = reader.readLine();   
		}
		double k = timer1.elapsedTime();//Termina o tempo de execução k possui a diferença do incio com o fim 
		
		return k;
	}
	
	public double hashMap() throws Exception {//método completo
		HashMap<String,String> HM = new HashMap<String,String>();
		InputStreamReader stream = new InputStreamReader(getClass().getResourceAsStream("leipzig100k.txt"));
		BufferedReader reader = new BufferedReader(stream);
		String text = "";
		String line = reader.readLine(); 
		Stopwatch timer1 = new Stopwatch();//Aqui que começa a inserir na árvore!Começa o tempo de execução
		while (line!=null){
			for (String key : line.split(" ")) {
				if(!HM.containsKey(key))
					HM.put(key,"");
			}
			line = reader.readLine();   
		}
		double k = timer1.elapsedTime();//Termina o tempo de execução k possui a diferença do incio com o fim
		
		return k;
	}
	
	public double linkedHashMap() throws Exception {//método completo
		LinkedHashMap<String,String> LHM = new LinkedHashMap<String, String>();
		InputStreamReader stream = new InputStreamReader(getClass().getResourceAsStream("leipzig100k.txt"));
		BufferedReader reader = new BufferedReader(stream);
		String text = "";
		String line = reader.readLine(); 
		Stopwatch timer1 = new Stopwatch();//Aqui que começa a inserir na árvore!Começa o tempo de execução
		while (line!=null){
			for (String key : line.split(" ")) {
				if(!LHM.containsKey(key))
					LHM.put(key,"");
				}
			line = reader.readLine();   
		}
		double k = timer1.elapsedTime();//Termina o tempo de execução k possui a diferença do incio com o fim 
		return k;
	}
	
	public double treeMap() throws Exception {//método completo
		TreeMap<String,String> TM = new TreeMap<String, String>();
		InputStreamReader stream = new InputStreamReader(getClass().getResourceAsStream("leipzig100k.txt"));
		BufferedReader reader = new BufferedReader(stream);
		String text = "";
		String line = reader.readLine(); 
		Stopwatch timer1 = new Stopwatch();//Aqui que começa a inserir na árvore!Começa o tempo de execução
		while (line!=null){
			for (String key : line.split(" ")) {
				if(!TM.containsKey(key))
					TM.put(key,"");
				}
			line = reader.readLine();   
		}
		double k = timer1.elapsedTime();//Termina o tempo de execução k possui a diferença do incio com o fim 
		
		return k;
	}
	
	public double bTree() throws Exception {//método completo
		BTree<String,String> BT = new BTree<String, String>();
		InputStreamReader stream = new InputStreamReader(getClass().getResourceAsStream("leipzig100k.txt"));
		BufferedReader reader = new BufferedReader(stream);
		String text = "";
		String line = reader.readLine(); 
		Stopwatch timer1 = new Stopwatch();//Aqui que começa a inserir na árvore!Começa o tempo de execução
		while (line!=null){
			for (String key : line.split(" ")) {
				if(BT.get(key)==null)//então é porque não tem essa chave
					BT.put(key,"");//não precisa valor da chave
			}
			line = reader.readLine();   
		}
		double k = timer1.elapsedTime();//Termina o tempo de execução k possui a diferença do incio com o fim 
		return k;
	}
	
	public void grafico1() throws Exception {
		ds.addValue(this.linkedList(), "LinkedList", "Estruturas");
	}
	public void grafico2() throws Exception {
		ds.addValue(this.arrayList(), "ArrayList", "Estruturas");
	}
	public void grafico3() throws Exception {
		ds.addValue(this.hashSet(), "HashSet", "Estruturas");
	}
	public void grafico4() throws Exception {
		ds.addValue(this.linkedHashSet(), "LinkedHashSet", "Estruturas");
	}	
	public void grafico5() throws Exception {
		ds.addValue(this.treeSet(), "TreeSet", "Estruturas");
	}	
	public void grafico6() throws Exception {
		ds.addValue(this.hashMap(), "HashMap", "Estruturas");
	}
	public void grafico7() throws Exception {
		ds.addValue(this.linkedHashMap(), "LinkedHashMap", "Estruturas");
	}
	public void grafico8() throws Exception {
		ds.addValue(this.treeMap(), "TreeMap", "Estruturas");
	}
	public void grafico9() throws Exception {
		ds.addValue(this.bTree(), "BTree", "Estruturas");
	}
	public DefaultCategoryDataset getds() throws Exception{
		return this.ds;
	}
	public void setdsdefault() throws Exception{
		ds.clear();
	}

}
