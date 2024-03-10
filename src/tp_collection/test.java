package tp_collection;

import java.util.ArrayList;
import java.util.Collections;

public class test {

	public static void main(String[] args) {
		
		ArrayList <Etudiant> e = new ArrayList <>();
		Stats s = new Stats();
		
        e.add(new Etudiant("HH","ranim"));
        e.get(0).addNote(new Note("math",12));
        e.get(0).addNote(new Note("geo",14));
        
        e.add(new Etudiant("AA","rzouga"));
        e.get(1).addNote(new Note("math",16));
        e.get(1).addNote(new Note("geo",13));

        e.add(new Etudiant("BB","amal"));
        e.get(2).addNote(new Note("histoire",11));
        e.get(2).addNote(new Note("geo",7));

        s.afficherStatsEtudiants(e);
        System.out.println(e);
        System.out.println("apres trie");
        Collections.sort(e);
        s.afficherStatsEtudiants(e);
        
        s.afficherStatsEtudiants(e);
        System.out.println("max classe"+ s.getMaximumGroupe(e));
        System.out.println("min classe"+ s.getMinimumGroupe(e));
        
        
        System.out.println("apres trie par matricule");
        MatComaprator CM =new MatComaprator();
        Collections.sort(e,CM);
        s.afficherStatsEtudiants(e);
        
        System.out.println("apres trie par nom");
        NomComparator CN =new NomComparator();
        Collections.sort(e,CN);
        s.afficherStatsEtudiants(e);
        
        
		

	}

}
