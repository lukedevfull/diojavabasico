package edu.luke.candidatesFilter;

public class CandidatesSelection {
  //Verificar se o candidato a vaga possui uma pretenção salarial compatiel com o oferecido
  public void CompatibleSalaryFilter (float offeredSalary, float candidateSalary) {
    if (candidateSalary < offeredSalary) {
        System.out.println("Ligue para o candidato para agendar uma entrevista");
    } else {
        if (candidateSalary == offeredSalary) {
            System.out.println("Ligue para o candidato para propor uma contraproposta");
        } else {
            System.out.println("Desculpe, o candidato não atende aos requisitos da vaga");
        }
    }
  }

  public float Candidate (String name, float salary) {
    return salary;
  }

  public static void main(String[] args) {
    CandidatesSelection candidateFilter = new CandidatesSelection();

    float offeredSalary = 2000;

    float candidateSalary = candidateFilter.Candidate("João", 1500);
    candidateFilter.CompatibleSalaryFilter(offeredSalary, candidateSalary);

    candidateSalary = candidateFilter.Candidate("Bia", 2000);
    candidateFilter.CompatibleSalaryFilter(offeredSalary, candidateSalary);

    candidateSalary = candidateFilter.Candidate("Abervaldoino", 3456.90f);
    candidateFilter.CompatibleSalaryFilter(offeredSalary, candidateSalary);

  }
}
