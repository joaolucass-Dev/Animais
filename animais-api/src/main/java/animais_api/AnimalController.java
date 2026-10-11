package animais_api;

import animais_api.Animal.Cachorro;
import animais_api.Animal.Gato;
import org.springframework.web.bind.annotation.*; // Importa todas as anotações web (GetMapping, PostMapping, PathVariable, etc.)

import java.util.ArrayList;
import java.util.List;

@RestController // Diz ao Spring: "Esta classe é um controlador web que vai responder a requisições HTTP e retornar dados (geralmente JSON)"
@RequestMapping("/animais") // Define que todas as rotas desta classe vão começar com o prefixo "/animais"
public class AnimalController {

    // ==========================================
    // 1. GET SIMPLES (Listar todos)
    // ==========================================
    @GetMapping("/cachorros") // Escuta requisições GET na URL: http://localhost:8080/animais/cachorros
    public List<Cachorro> listarCachorros() {
        List<Cachorro> listaDeCachorros = new ArrayList<>();
        listaDeCachorros.add(new Cachorro("Max"));
        listaDeCachorros.add(new Cachorro("Branco"));
        return listaDeCachorros; // O Spring converte automaticamente essa lista em um array JSON
    }

    @GetMapping("/gatos") // Escuta requisições GET na URL: http://localhost:8080/animais/gatos
    public List<Gato> listarGatos() {
        List<Gato> listaDeGatos = new ArrayList<>();
        listaDeGatos.add(new Gato("Jully"));
        listaDeGatos.add(new Gato("Laranjinha"));
        return listaDeGatos;
    }

    // ==========================================
    // 2. GET COM @PathVariable (Busca dinâmica por parâmetro na URL)
    // ==========================================
    @GetMapping("/cachorros/{nome}") // O trecho {nome} vira uma variável na rota (ex: /animais/cachorros/Max)
    public Cachorro buscarCachorroPorNome(@PathVariable String nome) { 
        // @PathVariable pega o texto digitado na URL (no lugar de {nome}) e joga dentro da variável 'nome' em Java

        List<Cachorro> listaDeCachorros = new ArrayList<>();
        listaDeCachorros.add(new Cachorro("Max"));
        listaDeCachorros.add(new Cachorro("Branco"));

        // Laço de repetição para procurar o cachorro na lista
        for (Cachorro c : listaDeCachorros) {
            // Compara ignorando letras maiúsculas/minúsculas
            if (c.getNome().equalsIgnoreCase(nome)) {
                return c; // Se achou, para e retorna o objeto do cachorro (o Spring transforma em JSON)
            }
        }
        return null; // Se o loop acabar e não achar ninguém, retorna null (o Spring devolve um JSON vazio/vazio)
    }

    // ==========================================
    // 3. GET COM @RequestParam (Filtros por Query String na URL)
    // ==========================================
    // Exemplo de uso: http://localhost:8080/animais/buscar?termo=Max
    @GetMapping("/buscar")
    public String buscarComFiltro(@RequestParam(required = false) String termo) {
        // @RequestParam captura parâmetros passados após o '?' na URL. 
        // 'required = false' significa que se a pessoa não mandar o parâmetro, a API não quebra.
        return "Você buscou pelo termo: " + termo;
    }

    // ==========================================
    // 4. POST COM @RequestBody (Criar/Cadastrar novos dados)
    // ==========================================
    // Usado para ENVIAR dados para o servidor (geralmente enviado por ferramentas como Postman, Insomnia ou front-end)
    @PostMapping("/cachorros") 
    public Cachorro cadastrarCachorro(@RequestBody Cachorro novoCachorro) {
        // @RequestBody avisa o Spring: "Pegue o JSON enviado no corpo da requisição e monte um objeto Cachorro automaticamente pra mim"
        
        // Aqui você poderia salvar o 'novoCachorro' em um banco de dados ou numa lista global.
        // Por enquanto, apenas devolvemos o objeto criado para confirmar que o servidor recebeu.
        return novoCachorro; 
    }
}