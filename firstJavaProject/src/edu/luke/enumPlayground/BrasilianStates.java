package edu.luke.enumPlayground;

public enum BrasilianStates {
  ACRE("AC", "Acre"),
  ALAGOAS("AL", "Alagoas"),
  AMAZONAS("AM", "Amazonas"),
  BAHIA("BA", "Bahia"),
  CEARA("CE", "Ceará"),
  DISTRITO_FEDERAL("DF", "Distrito Federal"),
  ESPIRITO_SANTO("ES", "Espírito Santo"),
  GOIAS("GO", "Goiás"),
  MATO_GROSSO("MT", "Mato Grosso"),
  MATO_GROSSO_DO_SUL("MS", "Mato Grosso do Sul"),
  MINAS_GERAIS("MG", "Minas Gerais"),
  PARA("PA", "Pará"),
  PARAIBA("PB", "Paraíba"),
  PARANÁ("PR", "Paraná"),
  RIO_DE_JANEIRO("RJ", "Rio de Janeiro"),
  RIO_GRANDE_DO_NORTE("RN", "Rio Grande do Norte"),
  RIO_GRANDE_DO_SUL("RS", "Rio Grande do Sul"),
  RONDÔNIA("RO", "Rondônia"),
  RORAIMA("RR", "Roraima"),
  SANTA_CATARINA("SC", "Santa Catarina"),
  SÃO_PAULO("SP", "São Paulo"),
  SERGIPE("SE", "Sergipe"),
  TOCANTINS("TO", "Tocantins");

  private String abbreviation;
  private String name;

  private BrasilianStates(String abbreviation, String name) {
    this.abbreviation = abbreviation;
    this.name = name;
  }

  public String getAbbreviation() {
    return abbreviation;
  }
  public String getName() {
    return name;
  }
  public String getUpperCaseName() {
    return name.toUpperCase();
  }
}
