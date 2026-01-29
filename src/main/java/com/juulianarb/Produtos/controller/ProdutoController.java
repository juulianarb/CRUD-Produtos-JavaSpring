package com.juulianarb.Produtos.controller;

import com.juulianarb.Produtos.model.Produto;
import com.juulianarb.Produtos.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoController {

    private ProdutoRepository repository;

    public ProdutoController(ProdutoRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Produto salvarProduto(@RequestBody Produto produto) {
        System.out.println("Produto recebido com sucesso: " + produto);

        var id = UUID.randomUUID().toString();
        produto.setId(id);

        repository.save(produto);

        return produto;
    }

    @GetMapping("/{id}")
    public Produto obterPorId(@PathVariable("id") String id) {
       return repository.findById(id).orElse(null);
    }

    @PutMapping("{id}")
    public void atualizarProduto(@PathVariable("id") String id,
                                 @RequestBody Produto produto) {
        produto.setId(id);
        repository.save(produto);
    }

    @DeleteMapping("{id}")
    public void deletarProduto(@PathVariable("id") String id, Produto produto) {
        System.out.println("O produto foi deletado com sucesso!");
        repository.deleteById(id);

    }

    @GetMapping
    public List<Produto> buscar(@RequestParam("nome") String nome,
                                @RequestParam("preco") Double preco) {

       return repository.findByNome(nome, preco);
    }

}
