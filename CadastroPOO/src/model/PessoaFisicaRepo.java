package model;

import java.io.*;
import java.util.ArrayList;

public class PessoaFisicaRepo {

    private ArrayList<PessoaFisica> lista = new ArrayList<>();

    public void inserir(PessoaFisica pf) {
        lista.add(pf);
    }

    public void alterar(PessoaFisica pf) {
        PessoaFisica existente = obter(pf.getId());
        if (existente != null) {
            lista.remove(existente);
            lista.add(pf);
        }
    }

    public void excluir(int id) {
        PessoaFisica pf = obter(id);
        if (pf != null) {
            lista.remove(pf);
        }
    }

    public PessoaFisica obter(int id) {
        for (PessoaFisica pf : lista) {
            if (pf.getId() == id) {
                return pf;
            }
        }
        return null;
    }

    public ArrayList<PessoaFisica> obterTodos() {
        return lista;
    }

    public void persistir(String nomeArquivo) throws Exception {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nomeArquivo));
        out.writeObject(lista);
        out.close();
    }

    public void recuperar(String nomeArquivo) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(nomeArquivo));
        lista = (ArrayList<PessoaFisica>) in.readObject();
        in.close();
    }
}
