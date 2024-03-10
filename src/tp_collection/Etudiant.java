package tp_collection;

import java.util.ArrayList;

public class Etudiant implements IStatisticable,Comparable<Etudiant>{
	
	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	private String matricule;
	private String nom;
	private ArrayList <Note> notes ;
	public Etudiant(String matricule, String nom) {
		this.matricule = matricule;
		this.nom = nom;
		this.notes=new ArrayList<>();
		
	}
	
	public void addNote(Note n) {
		notes.add(n);
	}
	
	public void afficheEtudiant() {
		System.out.println(notes.toString()+"la matricule"+matricule+"le nom"+nom);
	}
	
	
	@Override
	public String toString() {
		return "Liste notes: "+ notes.toString()+"la matricule"+matricule+"le nom"+nom;
	}

	public float getValue(){
        float moy=0;
        for(int i=0;i<notes.size();i++)
        {
            moy+=notes.get(i).getNote();
        }
        return moy/notes.size();

    }

    public double getMin(){
        double min=notes.get(0).getNote();
        for(int i=0;i<notes.size();i++)
        {
            if (notes.get(i).getNote()<min){
                min=notes.get(i).getNote();
            }
        }
        return min;

    }
    
    public double getMax(){
        double max=notes.get(0).getNote();
        for(int i=0;i<notes.size();i++)
        {
            if (notes.get(i).getNote()>max){
                max=notes.get(i).getNote();
            }
        }
        return max;
    }
    
    public int compareTo(Etudiant e){
        if (this.getValue()>e.getValue()){
            return 1;
        }
        if (this.getValue()<e.getValue()){
            return -1;
        }
        return 0;
    }

	
	
	
	
	
	
}
