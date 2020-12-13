package Questao11e12;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
//*****************************************
//*****************************************
//*****************************************
//MÉTODOS QUE CRIAM A TS E RETORNAM O TEMPO DE EXECUÇÃO
public class TrabalhoFinalpart2 {
	private DefaultCategoryDataset ds = new DefaultCategoryDataset();
	
	public LinkedList<String> retornatabela1() throws Exception{//TS da LinkedList
		LinkedList<String> LL = new LinkedList<String>();
		InputStreamReader stream = new InputStreamReader(getClass().getResourceAsStream("leipzig100k.txt"));
		BufferedReader reader = new BufferedReader(stream);
		String line = reader.readLine(); 

		while (line!=null){
			for (String key : line.split(" ")) {
				if(!LL.contains(key))
					LL.add(key);
			    }
			line = reader.readLine();   
		}
		return LL;
	} 
	
	public ArrayList<String> retornatabela2() throws Exception{//TS do ArrayList
		ArrayList<String> AL = new ArrayList<String>();
		InputStreamReader stream = new InputStreamReader(getClass().getResourceAsStream("leipzig100k.txt"));
		BufferedReader reader = new BufferedReader(stream);
		String line = reader.readLine(); 
		while (line!=null){
			for (String key : line.split(" ")) {
				if(!AL.contains(key))
					AL.add(key);
			    }
			line = reader.readLine();   
		}
		return AL;
	} 
	
	
	public long linkedList(String palavra,LinkedList<String> LL) throws Exception {//completo
		Stopwatch timer1 = new Stopwatch();//Aqui que começa a inserir na árvore!Começa o tempo de execução
		LL.contains(palavra);
		long k = timer1.elapsedTime();//Termina o tempo de execução k possui a diferença do incio com o fim 
		return k;
	}
	
	public long arrayList(String palavra,ArrayList<String> AL) throws Exception {//completoD
		Stopwatch timer1 = new Stopwatch();//Aqui que começa a inserir na árvore!Começa o tempo de execução
		AL.contains(palavra);
		long k = timer1.elapsedTime();//Termina o tempo de execução k possui a diferença do incio com o fim 
		return k;
	}
	
	public long hashSet(String palavra) throws Exception {//completo
		HashSet<String> HS = new HashSet<String>();
		InputStreamReader stream = new InputStreamReader(getClass().getResourceAsStream("leipzig100k.txt"));
		BufferedReader reader = new BufferedReader(stream);
		String line = reader.readLine(); 
		while (line!=null){
			for (String key : line.split(" ")) {
				if(!HS.contains(key))
					HS.add(key);
			    }
			line = reader.readLine();   
		}
		Stopwatch timer1 = new Stopwatch();//Aqui que começa a inserir na árvore!Começa o tempo de execução
		HS.contains(palavra);
		long k = timer1.elapsedTime();//Termina o tempo de execução k possui a diferença do incio com o fim 
		
		return k;
	}
	
	public long linkedHashSet(String palavra) throws Exception {//completo
		LinkedHashSet<String> LHS = new LinkedHashSet<String>();
		InputStreamReader stream = new InputStreamReader(getClass().getResourceAsStream("leipzig100k.txt"));
		BufferedReader reader = new BufferedReader(stream);
		String line = reader.readLine(); 
		int value=0;
		while (line!=null){
			for (String key : line.split(" ")) {
				if(!LHS.contains(key))
					LHS.add(key);
			    }
			line = reader.readLine();   
		}
		Stopwatch timer1 = new Stopwatch();//Aqui que começa a inserir na árvore!Começa o tempo de execução
		LHS.contains(palavra);
		long k = timer1.elapsedTime();//Termina o tempo de execução k possui a diferença do incio com o fim 
		
		return k;
	}
	
	public long treeSet(String palavra) throws Exception {//completo
		TreeSet<String> TS = new TreeSet<String>();
		InputStreamReader stream = new InputStreamReader(getClass().getResourceAsStream("leipzig100k.txt"));
		BufferedReader reader = new BufferedReader(stream);
		String line = reader.readLine(); 
		while (line!=null){
			for (String key : line.split(" ")) {
				if(!TS.contains(key))
					TS.add(key);
			    }
			line = reader.readLine();   
		}
		Stopwatch timer1 = new Stopwatch();//Aqui que começa a inserir na árvore!Começa o tempo de execução
		TS.contains(palavra);
		long k = timer1.elapsedTime();//Termina o tempo de execução k possui a diferença do incio com o fim 
		
		return k;
	}
	
	public long hashMap(String palavra) throws Exception {//método completo
		HashMap<String,String> HM = new HashMap<String,String>();
		InputStreamReader stream = new InputStreamReader(getClass().getResourceAsStream("leipzig100k.txt"));
		BufferedReader reader = new BufferedReader(stream);
		String line = reader.readLine(); 
		while (line!=null){
			for (String key : line.split(" ")) {
				if(!HM.containsKey(key))
					HM.put(key,"");
			}
			line = reader.readLine();   
		}
		Stopwatch timer1 = new Stopwatch();//Aqui que começa a inserir na árvore!Começa o tempo de execução
		HM.containsKey(palavra);
		long k = timer1.elapsedTime();//Termina o tempo de execução k possui a diferença do incio com o fim
		
		return k;
	}
	
	public long linkedHashMap(String palavra) throws Exception {//método completo
		LinkedHashMap<String,String> LHM = new LinkedHashMap<String, String>();
		InputStreamReader stream = new InputStreamReader(getClass().getResourceAsStream("leipzig100k.txt"));
		BufferedReader reader = new BufferedReader(stream);
		String line = reader.readLine(); 
		while (line!=null){
			for (String key : line.split(" ")) {
				if(!LHM.containsKey(key))
					LHM.put(key,"");
				}
			line = reader.readLine();   
		}
		Stopwatch timer1 = new Stopwatch();//Aqui que começa a inserir na árvore!Começa o tempo de execução
		LHM.containsKey(palavra);
		long k = timer1.elapsedTime();//Termina o tempo de execução k possui a diferença do incio com o fim 
		return k;
	}
	
	public long treeMap(String palavra) throws Exception {//método completo
		TreeMap<String,String> TM = new TreeMap<String, String>();
		InputStreamReader stream = new InputStreamReader(getClass().getResourceAsStream("leipzig100k.txt"));
		BufferedReader reader = new BufferedReader(stream);
		String line = reader.readLine(); 
		while (line!=null){
			for (String key : line.split(" ")) {
				if(!TM.containsKey(key))
					TM.put(key,"");
				}
			line = reader.readLine();   
		}
		Stopwatch timer1 = new Stopwatch();//Aqui que começa a inserir na árvore!Começa o tempo de execução
		TM.containsKey(palavra);
		long k = timer1.elapsedTime();//Termina o tempo de execução k possui a diferença do incio com o fim 
		
		return k;
	}
	
	public long bTree(String palavra) throws Exception {//método completo
		BTree<String,String> BT = new BTree<String, String>();
		InputStreamReader stream = new InputStreamReader(getClass().getResourceAsStream("leipzig100k.txt"));
		BufferedReader reader = new BufferedReader(stream);
		String line = reader.readLine(); 
		while (line!=null){
			for (String key : line.split(" ")) {
				if(BT.get(key)==null)//então é porque não tem essa chave
					BT.put(key,"");//não precisa valor da chave
			}
			line = reader.readLine();   
		}
		Stopwatch timer1 = new Stopwatch();//Aqui que começa a inserir na árvore!Começa o tempo de execução
		BT.get(palavra);
		long k = timer1.elapsedTime();//Termina o tempo de execução k possui a diferença do incio com o fim 
		return k;
	}
	
	public void grafico1(LinkedList<String> LL) throws Exception {//linkedList
		
		ds.addValue(this.linkedList("Lisbon",LL), "LinkedList", "Lisbon");
		ds.addValue(this.linkedList("NASA",LL), "LinkedList", "NASA");
		ds.addValue(this.linkedList("Kyunghee", LL), "LinkedList", "Kyunghee");
		ds.addValue(this.linkedList("Konkuk", LL), "LinkedList", "Konkuk");
		ds.addValue(this.linkedList("Sogang", LL), "LinkedList", "Sogang");
		ds.addValue(this.linkedList("momentarily", LL), "LinkedList", "momentarily");
		ds.addValue(this.linkedList("rubella", LL), "LinkedList", "rubella");
		ds.addValue(this.linkedList("vaccinations", LL), "LinkedList", "vaccinations");
		ds.addValue(this.linkedList("government",LL), "LinkedList", "government");
		ds.addValue(this.linkedList("Authorities",LL), "LinkedList", "Authorities");
	}
	public void grafico2(ArrayList<String> AL) throws Exception {//ArrayList
		ds.addValue(this.arrayList("Lisbon",AL), "ArrayList", "Lisbon");
		ds.addValue(this.arrayList("NASA",AL), "ArrayList", "NASA");
		ds.addValue(this.arrayList("Kyunghee",AL), "ArrayList", "Kyunghee");
		ds.addValue(this.arrayList("Konkuk",AL), "ArrayList", "Konkuk");
		ds.addValue(this.arrayList("Sogang",AL), "ArrayList", "Sogang");
		ds.addValue(this.arrayList("momentarily",AL), "ArrayList", "momentarily");
		ds.addValue(this.arrayList("rubella",AL), "ArrayList", "rubella");
		ds.addValue(this.arrayList("vaccinations",AL), "ArrayList", "vaccinations");
		ds.addValue(this.arrayList("government",AL), "ArrayList", "government");
		ds.addValue(this.arrayList("Authorities",AL), "ArrayList", "Authorities");
	}
	public void grafico3() throws Exception {//HashSet
		ds.addValue(this.hashSet("Lisbon"), "HashSet", "Lisbon");
		ds.addValue(this.hashSet("NASA"), "HashSet", "NASA");
		ds.addValue(this.hashSet("Kyunghee"), "HashSet", "Kyunghee");
		ds.addValue(this.hashSet("Konkuk"), "HashSet", "Konkuk");
		ds.addValue(this.hashSet("Sogang"), "HashSet", "Sogang");
		ds.addValue(this.hashSet("momentarily"), "HashSet", "momentarily");
		ds.addValue(this.hashSet("rubella"), "HashSet", "rubella");
		ds.addValue(this.hashSet("vaccinations"), "HashSet", "vaccinations");
		ds.addValue(this.hashSet("government"), "HashSet", "government");
		ds.addValue(this.hashSet("Authorities"), "HashSet", "Authorities");
	}
	public void grafico4() throws Exception {
		ds.addValue(this.linkedHashSet("Lisbon"), "LinkedHashSet", "Lisbon");
		ds.addValue(this.linkedHashSet("NASA"), "LinkedHashSet", "NASA");
		ds.addValue(this.linkedHashSet("Kyunghee"), "LinkedHashSet", "Kyunghee");
		ds.addValue(this.linkedHashSet("Konkuk"), "LinkedHashSet", "Konkuk");
		ds.addValue(this.linkedHashSet("Sogang"), "LinkedHashSet", "Sogang");
		ds.addValue(this.linkedHashSet("momentarily"), "LinkedHashSet", "momentarily");
		ds.addValue(this.linkedHashSet("rubella"), "LinkedHashSet", "rubella");
		ds.addValue(this.linkedHashSet("vaccinations"), "LinkedHashSet", "vaccinations");
		ds.addValue(this.linkedHashSet("government"), "LinkedHashSet", "government");
		ds.addValue(this.linkedHashSet("Authorities"), "LinkedHashSet", "Authorities");
	}	
	public void grafico5() throws Exception {
		ds.addValue(this.treeSet("Lisbon"), "TreeSet", "Lisbon");
		ds.addValue(this.treeSet("NASA"), "TreeSet", "NASA");
		ds.addValue(this.treeSet("Kyunghee"), "TreeSet", "Kyunghee");
		ds.addValue(this.treeSet("Konkuk"), "TreeSet", "Konkuk");
		ds.addValue(this.treeSet("Sogang"), "TreeSet", "Sogang");
		ds.addValue(this.treeSet("momentarily"), "TreeSet", "momentarily");
		ds.addValue(this.treeSet("rubella"), "TreeSet", "rubella");
		ds.addValue(this.treeSet("vaccinations"), "TreeSet", "vaccinations");
		ds.addValue(this.treeSet("government"), "TreeSet", "government");
		ds.addValue(this.treeSet("Authorities"), "TreeSet", "Authorities");
	}	
	public void grafico6() throws Exception {
		ds.addValue(this.hashMap("Lisbon"), "HashMap", "Lisbon");
		ds.addValue(this.hashMap("NASA"), "HashMap", "NASA");
		ds.addValue(this.hashMap("Kyunghee"), "HashMap", "Kyunghee");
		ds.addValue(this.hashMap("Konkuk"), "HashMap", "Konkuk");
		ds.addValue(this.hashMap("Sogang"), "HashMap", "Sogang");
		ds.addValue(this.hashMap("momentarily"), "HashMap", "momentarily");
		ds.addValue(this.hashMap("rubella"), "HashMap", "rubella");
		ds.addValue(this.hashMap("vaccinations"), "HashMap", "vaccinations");
		ds.addValue(this.hashMap("government"), "HashMap", "government");
		ds.addValue(this.hashMap("Authorities"), "HashMap", "Authorities");
	}
	public void grafico7() throws Exception {
		ds.addValue(this.linkedHashMap("Lisbon"), "LinkedHashMap", "Lisbon");
		ds.addValue(this.linkedHashMap("NASA"), "LinkedHashMap", "NASA");
		ds.addValue(this.linkedHashMap("Kyunghee"), "LinkedHashMap", "Kyunghee");
		ds.addValue(this.linkedHashMap("Konkuk"), "LinkedHashMap", "Konkuk");
		ds.addValue(this.linkedHashMap("Sogang"), "LinkedHashMap", "Sogang");
		ds.addValue(this.linkedHashMap("momentarily"), "LinkedHashMap", "momentarily");
		ds.addValue(this.linkedHashMap("rubella"), "LinkedHashMap", "rubella");
		ds.addValue(this.linkedHashMap("vaccinations"), "LinkedHashMap", "vaccinations");
		ds.addValue(this.linkedHashMap("government"), "LinkedHashMap", "government");
		ds.addValue(this.linkedHashMap("Authorities"), "LinkedHashMap", "Authorities");
	}
	public void grafico8() throws Exception {
		ds.addValue(this.treeMap("Lisbon"), "TreeMap", "Lisbon");
		ds.addValue(this.treeMap("NASA"), "TreeMap", "NASA");
		ds.addValue(this.treeMap("Kyunghee"), "TreeMap", "Kyunghee");
		ds.addValue(this.treeMap("Konkuk"), "TreeMap", "Konkuk");
		ds.addValue(this.treeMap("Sogang"), "TreeMap", "Sogang");
		ds.addValue(this.treeMap("momentarily"), "TreeMap", "momentarily");
		ds.addValue(this.treeMap("rubella"), "TreeMap", "rubella");
		ds.addValue(this.treeMap("vaccinations"), "TreeMap", "vaccinations");
		ds.addValue(this.treeMap("government"), "TreeMap", "government");
		ds.addValue(this.treeMap("Authorities"), "TreeMap", "Authorities");
	}
	public void grafico9() throws Exception {
		ds.addValue(this.bTree("Lisbon"), "BTree", "Lisbon");
		ds.addValue(this.bTree("NASA"), "BTree", "NASA");
		ds.addValue(this.bTree("Kyunghee"), "BTree", "Kyunghee");
		ds.addValue(this.bTree("Konkuk"), "BTree", "Konkuk");
		ds.addValue(this.bTree("Sogang"), "BTree", "Sogang");
		ds.addValue(this.bTree("momentarily"), "BTree", "momentarily");
		ds.addValue(this.bTree("rubella"), "BTree", "rubella");
		ds.addValue(this.bTree("vaccinations"), "BTree", "vaccinations");
		ds.addValue(this.bTree("government"), "BTree", "government");
		ds.addValue(this.bTree("Authorities"), "BTree", "Authorities");
	}
	public DefaultCategoryDataset getds() throws Exception{
		return this.ds;
	}
	public void setdsdefault() throws Exception{
		ds.clear();
	}
	//*****************************************
	//*****************************************
	//*****************************************
	
	//MÉTODOS QUE CRIAM A TS E RETORNAM BOOLEAN SE ACHOU OU NÃO A PALAVRA NA TS DE CADA ESTRUTUTURA 
	public String linkedList1(String palavra) throws Exception {//completo
		LinkedList<String> LL = new LinkedList<String>();
		InputStreamReader stream = new InputStreamReader(getClass().getResourceAsStream("leipzig100k.txt"));
		BufferedReader reader = new BufferedReader(stream);
		String line = reader.readLine(); 
		while (line!=null){//cria  a ts com linkedlist
			for (String key : line.split(" ")) {
				if(!LL.contains(key))
					LL.add(key);
			    }
			line = reader.readLine();   
		}
		Stopwatch timer1 = new Stopwatch();//Aqui que começa a inserir na árvore!Começa o tempo de execução
		boolean aux=LL.contains(palavra);
		long k = timer1.elapsedTime();//Termina o tempo de execução k possui a diferença do incio com o fim 
		if (aux) {//se achou então..
			return "A palavra "+palavra+" foi achada com o tempo de "+k+" nanosegundos!";
		}
		else {
			return "A palavra "+palavra+" não foi achada e a busca durou "+k+" nanosegundos!";
		}
		
		
	}
	
	public String arrayList1(String palavra) throws Exception {//completo
		ArrayList<String> AL = new ArrayList<String>();
		InputStreamReader stream = new InputStreamReader(getClass().getResourceAsStream("leipzig100k.txt"));
		BufferedReader reader = new BufferedReader(stream);
		String line = reader.readLine(); 
		while (line!=null){
			for (String key : line.split(" ")) {
				if(!AL.contains(key))
					AL.add(key);
			    }
			line = reader.readLine();   
		}
		Stopwatch timer1 = new Stopwatch();//Aqui que começa a inserir na árvore!Começa o tempo de execução
		boolean aux=AL.contains(palavra);
		long k = timer1.elapsedTime();//Termina o tempo de execução k possui a diferença do incio com o fim 
		if (aux) {//se achou então..
			return "A palavra "+palavra+" foi achada com o tempo de "+k+" nanosegundos!";
		}
		else {
			return "A palavra "+palavra+" não foi achada e a busca durou "+k+" nanosegundos!";
		}
	}
	
	public String hashSet1(String palavra) throws Exception {//completo
		HashSet<String> HS = new HashSet<String>();
		InputStreamReader stream = new InputStreamReader(getClass().getResourceAsStream("leipzig100k.txt"));
		BufferedReader reader = new BufferedReader(stream);
		String line = reader.readLine(); 
		while (line!=null){
			for (String key : line.split(" ")) {
				if(!HS.contains(key))
					HS.add(key);
			    }
			line = reader.readLine();   
		}
		Stopwatch timer1 = new Stopwatch();//Aqui que começa a inserir na árvore!Começa o tempo de execução
		boolean aux=HS.contains(palavra);
		long k = timer1.elapsedTime();//Termina o tempo de execução k possui a diferença do incio com o fim 
		if (aux) {//se achou então..
			return "A palavra "+palavra+" foi achada com o tempo de "+k+" nanosegundos!";
		}
		else {
			return "A palavra "+palavra+" não foi achada e a busca durou "+k+" nanosegundos!";
		}

	}
	
	public String linkedHashSet1(String palavra) throws Exception {//completo
		LinkedHashSet<String> LHS = new LinkedHashSet<String>();
		InputStreamReader stream = new InputStreamReader(getClass().getResourceAsStream("leipzig100k.txt"));
		BufferedReader reader = new BufferedReader(stream);
		String line = reader.readLine(); 
		int value=0;
		while (line!=null){
			for (String key : line.split(" ")) {
				if(!LHS.contains(key))
					LHS.add(key);
			    }
			line = reader.readLine();   
		}
		Stopwatch timer1 = new Stopwatch();//Aqui que começa a inserir na árvore!Começa o tempo de execução
		boolean aux=LHS.contains(palavra);
		long k = timer1.elapsedTime();//Termina o tempo de execução k possui a diferença do incio com o fim 
		if (aux) {//se achou então..
			return "A palavra "+palavra+" foi achada com o tempo de "+k+" nanosegundos!";
		}
		else {
			return "A palavra "+palavra+" não foi achada e a busca durou "+k+" nanosegundos!";
		}

	}
	
	public String treeSet1(String palavra) throws Exception {//completo
		TreeSet<String> TS = new TreeSet<String>();
		InputStreamReader stream = new InputStreamReader(getClass().getResourceAsStream("leipzig100k.txt"));
		BufferedReader reader = new BufferedReader(stream);
		String line = reader.readLine(); 
		while (line!=null){
			for (String key : line.split(" ")) {
				if(!TS.contains(key))
					TS.add(key);
			    }
			line = reader.readLine();   
		}
		Stopwatch timer1 = new Stopwatch();//Aqui que começa a inserir na árvore!Começa o tempo de execução
		boolean aux=TS.contains(palavra);
		long k = timer1.elapsedTime();//Termina o tempo de execução k possui a diferença do incio com o fim 
		if (aux) {//se achou então..
			return "A palavra "+palavra+" foi achada com o tempo de "+k+" nanosegundos!";
		}
		else {
			return "A palavra "+palavra+" não foi achada e a busca durou "+k+" nanosegundos!";
		}
	}
	
	public String hashMap1(String palavra) throws Exception {//método completo
		HashMap<String,String> HM = new HashMap<String,String>();
		InputStreamReader stream = new InputStreamReader(getClass().getResourceAsStream("leipzig100k.txt"));
		BufferedReader reader = new BufferedReader(stream);
		String line = reader.readLine(); 
		while (line!=null){
			for (String key : line.split(" ")) {
				if(!HM.containsKey(key))
					HM.put(key,"");
			}
			line = reader.readLine();   
		}
		Stopwatch timer1 = new Stopwatch();//Aqui que começa a inserir na árvore!Começa o tempo de execução
		boolean aux=HM.containsKey(palavra);
		long k = timer1.elapsedTime();//Termina o tempo de execução k possui a diferença do incio com o fim 
		if (aux) {//se achou então..
			return "A palavra "+palavra+" foi achada com o tempo de "+k+" nanosegundos!";
		}
		else {
			return "A palavra "+palavra+" não foi achada e a busca durou "+k+" nanosegundos!";
		}

	}
	
	public String linkedHashMap1(String palavra) throws Exception {//método completo
		LinkedHashMap<String,String> LHM = new LinkedHashMap<String, String>();
		InputStreamReader stream = new InputStreamReader(getClass().getResourceAsStream("leipzig100k.txt"));
		BufferedReader reader = new BufferedReader(stream);
		String line = reader.readLine(); 
		while (line!=null){
			for (String key : line.split(" ")) {
				if(!LHM.containsKey(key))
					LHM.put(key,"");
				}
			line = reader.readLine();   
		}
		Stopwatch timer1 = new Stopwatch();//Aqui que começa a inserir na árvore!Começa o tempo de execução
		boolean aux=LHM.containsKey(palavra);
		long k = timer1.elapsedTime();//Termina o tempo de execução k possui a diferença do incio com o fim 
		if (aux) {//se achou então..
			return "A palavra "+palavra+" foi achada com o tempo de "+k+" nanosegundos!";
		}
		else {
			return "A palavra "+palavra+" não foi achada e a busca durou "+k+" nanosegundos!";
		}

	}
	
	public String treeMap1(String palavra) throws Exception {//método completo
		TreeMap<String,String> TM = new TreeMap<String, String>();
		InputStreamReader stream = new InputStreamReader(getClass().getResourceAsStream("leipzig100k.txt"));
		BufferedReader reader = new BufferedReader(stream);
		String line = reader.readLine(); 
		while (line!=null){
			for (String key : line.split(" ")) {
				if(!TM.containsKey(key))
					TM.put(key,"");
				}
			line = reader.readLine();   
		}
		Stopwatch timer1 = new Stopwatch();//Aqui que começa a inserir na árvore!Começa o tempo de execução
		boolean aux=TM.containsKey(palavra);
		long k = timer1.elapsedTime();//Termina o tempo de execução k possui a diferença do incio com o fim 
		if (aux) {//se achou então..
			return "A palavra "+palavra+" foi achada com o tempo de "+k+" nanosegundos!";
		}
		else {
			return "A palavra "+palavra+" não foi achada e a busca durou "+k+" nanosegundos!";
		}

	}
	
	public String bTree1(String palavra) throws Exception {//método completo
		BTree<String,String> BT = new BTree<String, String>();
		InputStreamReader stream = new InputStreamReader(getClass().getResourceAsStream("leipzig100k.txt"));
		BufferedReader reader = new BufferedReader(stream);
		String line = reader.readLine(); 
		while (line!=null){
			for (String key : line.split(" ")) {
				if(BT.get(key)==null)//então é porque não tem essa chave
					BT.put(key,"");//não precisa valor da chave
			}
			line = reader.readLine();   
		}
		Stopwatch timer1 = new Stopwatch();//Aqui que começa a inserir na árvore!Começa o tempo de execução
		boolean aux=false;
		if(BT.get(palavra)!=null) {//se achar a palavra..
		aux=true;
		}
		double k = timer1.elapsedTime();//Termina o tempo de execução k possui a diferença do incio com o fim 
		if (aux) {//se achou então..
			return "A palavra "+palavra+" foi achada com o tempo de "+k+" nanosegundos!";
		}
		else {
			return "A palavra "+palavra+" não foi achada e a busca durou "+k+" nanosegundos!";
		}
	}

	

}

