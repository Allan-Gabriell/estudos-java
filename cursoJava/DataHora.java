package cursoJava;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataHora {
    public static void main(String[] args) {
        //Instanciação
        LocalDate d01 = LocalDate.now(); //instanciei com a data de agora
        System.out.println(d01);

        //Instanciar com hora
        LocalDateTime d02 = LocalDateTime.now();
        System.out.println(d02);

        //Fuso horário global com fuso horário
        Instant d03 = Instant.now();
        System.out.println(d03);

        //Texto ISO 8601 -> data-hora;
        LocalDate d04 = LocalDate.parse("2022-07-20");
        System.out.println(d04);

        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:36");
        System.out.println(d05);

        //Texto formato customizado -> data-hora;
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d06 = LocalDate.parse("20/07/2022", fmt1);
        System.out.println(d06);

        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime d07 = LocalDateTime.parse("20/07/2022 01:30", fmt2);
        System.out.println(d07);

        LocalDate d08 = LocalDate.of(2022, 07, 20);
        System.out.println(d08);

        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(d04.format(fmt3));
        System.out.println(fmt3.format(d04));

        DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println(fmt4.format(d02));

        DateTimeFormatter fmt5 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); //Pega o fuso do meu sistema
        System.out.println(fmt5.format(d03));

        //Converter data-hora global para local:
        Instant d09 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate r1 = LocalDate.ofInstant(d09, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d09, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d09, ZoneId.of("Portugal"));

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

        //Cálculos com data-hora

        System.out.println("----------------------------------");
        LocalDate d11 = LocalDate.parse("2022-07-20");
        LocalDateTime d12 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d13 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate pastWeekLocalDate = d11.minusDays(7); //instanciei uma data que é o d11 - 7 dias
        LocalDate nextWeekLocalDate = d11.plusDays(8); // d11 + 8 dias

        System.out.println(pastWeekLocalDate);
        System.out.println(nextWeekLocalDate);

        LocalDateTime pastLocalDateTime = d12.minusDays(7);
        LocalDateTime nexLocalDateTime = d12.plusDays(8);

        System.out.println(pastLocalDateTime);
        System.out.println(nexLocalDateTime);

        // duração
        Duration t1 = Duration.between(pastLocalDateTime, nexLocalDateTime);
        System.out.println(t1.toDays());

    }
}
