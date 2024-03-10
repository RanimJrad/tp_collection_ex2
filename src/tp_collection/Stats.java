package tp_collection;

import java.util.ArrayList;
import java.util.Iterator;


public class Stats {
	
	public void afficherStatsEtudiants (ArrayList<Etudiant> L) {
		Iterator<Etudiant> i =L.iterator();
		int j=0;
		while(i.hasNext()) {
			Etudiant E = i.next();
			System.out.println("etudiant num:"+ j);
			j++;
			System.out.println(E.getValue()); 
			System.out.println(E.getMin()); 
			System.out.println(E.getMax()); 
		}
	}
	 public float getMoyenneGroupe (ArrayList<Etudiant>l){
	        float moy=0;
	        for (Etudiant e:l){
	            moy+=e.getValue();
	        }
	        return moy/l.size();
	    }

	    public float getMaximumGroupe (ArrayList<Etudiant>l){
	        float max=l.get(0).getValue();
	        for (Etudiant e:l){
	            if (max< e.getValue()){
	                max=e.getValue();
	            }
	        }
	        return max;
	    }

	    public float getMinimumGroupe (ArrayList<Etudiant>l){
	        float min=l.get(0).getValue();
	        for (Etudiant e:l){
	            if (min> e.getValue()){
	                min=e.getValue();
	            }
	        }
	        return min;
	    }
		
		
	}
	

