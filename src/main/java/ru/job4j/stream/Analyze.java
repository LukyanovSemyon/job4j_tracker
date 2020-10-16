package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Analyze {

    public static double averageScore(Stream<Pupil> stream) {
        return stream.flatMap((s) -> s.getSubjects().stream())
                .mapToInt(Subject::getScore)
                .average().orElse(0D);
    }

    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {
        return stream.map((s) -> new Tuple(s.getName(),
                (s.getSubjects().stream())
                .mapToInt(Subject::getScore)
                .average().orElse(0D)))
                .collect(Collectors.toList());
    }

    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
        return stream.flatMap((s) -> s.getSubjects().stream())
                .collect(Collectors.groupingBy(Subject::getName,
                        Collectors.averagingDouble(Subject::getScore)))
                .entrySet().stream().map((r) -> new Tuple(r.getKey(), r.getValue()))
                .collect(Collectors.toList());
    }

    public static Tuple bestStudent(Stream<Pupil> stream) {
        return stream.map((s) -> new Tuple(s.getName(),
                (s.getSubjects().stream())
                        .mapToInt(Subject::getScore)
                        .sum()))
                .max((l, r) -> (int) (l.getScore() - r.getScore())).orElse(null);
    }

    public static Tuple bestSubject(Stream<Pupil> stream) {
        return stream.flatMap((s) -> s.getSubjects().stream())
                .collect(Collectors.groupingBy(Subject::getName,
                        Collectors.summingDouble(Subject::getScore)))
                .entrySet().stream().map((r) -> new Tuple(r.getKey(), r.getValue()))
                .max((l, r) -> (int) (l.getScore() - r.getScore())).orElse(null);
    }
}
