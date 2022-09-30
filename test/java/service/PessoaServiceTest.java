package service;

import model.Pessoa;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class PessoaServiceTest {



    @Test
   public void devePermitirEntradaMaior18(){
        //Given
        PessoaService pessoaService = new PessoaService();

        Pessoa pessoa = new Pessoa("Maria", 18, false);

        //When
        boolean podeEntrar =
        pessoaService.podeEntrar(pessoa);

        //Then
        Assertions.assertTrue(podeEntrar);
    }

    @Test
    public void devePermitirAEntradaComAcopanhante(){
        //Given
        PessoaService pessoaService = new PessoaService();

        Pessoa pessoa = new Pessoa("João", 16, true);

        //When
        boolean podeEntrar =
                pessoaService.podeEntrar(pessoa);

        //Then
        Assertions.assertTrue(podeEntrar);

    }

    @Test
    public void naoPermitirMenorDeDezesseis(){
        //Given
        PessoaService pessoaService = new PessoaService();

        Pessoa pessoa = new Pessoa("José", 15, false);

        //When
        boolean podeEntrar =
                pessoaService.podeEntrar(pessoa);

        //Then
        Assertions.assertFalse(podeEntrar);

    }
}
