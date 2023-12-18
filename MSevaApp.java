mkdir M_SeVa
// File: M_SeVa/MedicalService.java
package M_SeVa;

public interface MedicalService {
    void welcomeMessage();
    void enterSymptoms(String[] symptoms);
    void identifyDisease();
}
// File: M_SeVa/MSevaSystem.java
package M_SeVa;

import java.util.HashSet;
import java.util.Set;

public class MSevaSystem implements MedicalService {

    private Set<String> commonSymptoms;
    private Set<String> symptomsAP;
    private Set<String> symptomsA;
    private Set<String> symptomsBC;
    private Set<String> symptomsPC;

    public MSevaSystem() {
        commonSymptoms = new HashSet<>();
        symptomsAP = new HashSet<>();
        symptomsA = new HashSet<>();
        symptomsBC = new HashSet<>();
        symptomsPC = new HashSet<>();

        // Common symptoms for all diseases
        commonSymptoms.add("Stomach ache");
        commonSymptoms.add("Vomiting");
        commonSymptoms.add("Low eye sight");

        // Symptoms for AP (Acute pancreatitis)
        symptomsAP.add("Muscle ache");
        symptomsAP.add("Fever");

        // Symptoms for A (Appendicitis)
        symptomsA.add("Fever");
        symptomsA.add("Fatigue");

        // Symptoms for BC (Bladder Cancer)
        symptomsBC.add("Skin allergy");
        symptomsBC.add("Low bp");

        // Symptoms for PC (Pancreatic Cancer)
        symptomsPC.add("Fever");
        symptomsPC.add("Fatigue");
    }

    @Override
    public void welcomeMessage() {
        System.out.println("Welcome to M-Seva");
    }

    @Override
    public void enterSymptoms(String[] symptoms) {
        System.out.println("Enter your symptoms:");

        for (String symptom : symptoms) {
            System.out.println(symptom);
        }
    }

    @Override
    public void identifyDisease() {
        Set<String> userSymptoms = new HashSet<>(); // Assume user entered symptoms

        // Compare symptoms with each disease
        Set<String> possibleDiseases = new HashSet<>();
        possibleDiseases.addAll(checkSymptoms(userSymptoms, symptomsAP, "Acute pancreatitis (AP)"));
        possibleDiseases.addAll(checkSymptoms(userSymptoms, symptomsA, "Appendicitis (A)"));
        possibleDiseases.addAll(checkSymptoms(userSymptoms, symptomsBC, "Bladder Cancer (BC)"));
        possibleDiseases.addAll(checkSymptoms(userSymptoms, symptomsPC, "Pancreatic Cancer (PC)"));

        if (!possibleDiseases.isEmpty()) {
            System.out.println("Possible diseases based on symptoms: " + possibleDiseases);
        } else {
            System.out.println("No matching diseases found.");
        }
    }

    private Set<String> checkSymptoms(Set<String> userSymptoms, Set<String> diseaseSymptoms, String diseaseName) {
        Set<String> matchingSymptoms = new HashSet<>(userSymptoms);
        matchingSymptoms.retainAll(diseaseSymptoms);

        return matchingSymptoms.size() == diseaseSymptoms.size() ? Set.of(diseaseName) : Set.of();
    }
}
// File: MSevaApp.java
import M_SeVa.MSevaSystem;

public class MSevaApp {
    public static void main(String[] args) {
        MSevaSystem mSeva = new MSevaSystem();

        // Welcome message
        mSeva.welcomeMessage();

        // Assume user entered symptoms
        String[] userSymptoms = {"Stomach ache", "Vomiting", "Fever"};

        // Enter symptoms
        mSeva.enterSymptoms(userSymptoms);

        // Identify diseases
        mSeva.identifyDisease();
    }
}
