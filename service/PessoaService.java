package service;

import model.Pessoa;

public class PessoaService {

   public boolean podeEntrar(Pessoa pessoa) {
      if (pessoa.getIdade() >= 18) {
         return true;
      } else if (pessoa.getIdade() >= 16 && pessoa.isAcompanhado())
      {
         return true;
   }else
           return false;
   }
}
