package unipe.edu.br;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;


public class MinhaAgendaDeAniversariosTest {

    private MinhaAgendaDeAniversarios minhaAgenda;

    @BeforeEach
    void setup() {
        minhaAgenda = new MinhaAgendaDeAniversarios();
    }

    @Test
    @DisplayName("Deve adicionar um aniversariante")
    void adicionarAniversariante() {
        Aniversariante aniversariante = new Aniversariante("Andrey", 1, 12);
        minhaAgenda.adicionarAniversariante("Andrey", 1, 12);
        assertFalse(minhaAgenda.obterAniversariantesDoDia(1, 12).isEmpty());
    }
}
