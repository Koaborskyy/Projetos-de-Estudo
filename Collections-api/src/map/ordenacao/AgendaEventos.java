package map.ordenacao;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atrcao) {
        Evento evento = new Evento(nome, atrcao);
        eventosMap.put(data, evento);
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            LocalDate dataEvento = entry.getKey();
            Evento evento = entry.getValue();
            System.out.println(
                    "Data: " + dataEvento + ", Evento: " + evento.getNome() + ", Atração: " + evento.getAtracao());
        }
    }

    public void obterProximoEvento() {

        Set<LocalDate> dateSet = eventosMap.keySet();
        Collection<Evento> values = eventosMap.values();

        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " + entry.getValue() + "acontecerá na data " + entry.getKey());
                break;
            }
        }
    }

    public void obterAnteriorEvento() {
        LocalDate dataAtual = LocalDate.now();
        LocalDate anteriorData = null;
        Evento anteriorEvento = null;

        var eventosTreeMap = new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            if (entry.getKey().isEqual(anteriorData) || entry.getKey().isBefore(anteriorData)) {
                anteriorData = entry.getKey();
                anteriorEvento = entry.getValue();
                System.out.println("O evento anterior: " + entry.getValue() + " aconteceu na data " + entry.getKey());
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2022, 07, 15), "Evento 1", "Atração 1");
        agendaEventos.adicionarEvento(LocalDate.of(2025, 02, 17), "Evento 2", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2025, 04, 20), "Evento 3", "Atração 3");
        agendaEventos.adicionarEvento(LocalDate.of(2026, 01, 01), "Evento 4", "Atração 4");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 11, 06), "Evento 5", "Atração 5");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 8, 15), "Evento 6", "Atração 6");
        agendaEventos.adicionarEvento(LocalDate.of(2026, 02, 14), "Evento 7", "Atração 7");

        agendaEventos.exibirAgenda();
        agendaEventos.obterAnteriorEvento();
        agendaEventos.obterProximoEvento();
    }
}