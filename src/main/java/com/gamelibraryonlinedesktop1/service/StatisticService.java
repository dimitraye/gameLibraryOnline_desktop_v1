package com.gamelibraryonlinedesktop1.service;

import com.gamelibraryonlinedesktop1.model.Game;
import com.gamelibraryonlinedesktop1.model.Progression;
import com.gamelibraryonlinedesktop1.model.Statistic;
import com.gamelibraryonlinedesktop1.model.User;
import com.gamelibraryonlinedesktop1.model.VideoGameGenre;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author dimit
 */
public class StatisticService {
    
    private VideoGameGenre genre;


    public Statistic generateStatistics(User user, List<Game> games, List<Progression> progressions) {
        Statistic statistic = new Statistic();

        // Total des jeux
        int nbTotalGames = games.size();

        // Jeux non commencés
        int nbGamesNotStarted = (int) progressions.stream()
                .filter(p -> p.getUser().equals(user) && p.getPercentageCompletion() == 0)
                .count();

        // Jeux commencés mais non terminés
        int nbGamesStarted = (int) progressions.stream()
                .filter(p -> p.getUser().equals(user) &&
                        p.getPercentageCompletion() > 0 &&
                        p.getPercentageCompletion() < 100)
                .count();

        // Jeux terminés
        int nbGamesFinished = (int) progressions.stream()
                .filter(p -> p.getUser().equals(user) && p.getPercentageCompletion() == 100)
                .count();

        // Jeux par plateforme
        Map<String, Long> gamesByPlatform = games.stream()
                .filter(g -> g.getUser().equals(user))
                .collect(Collectors.groupingBy(g -> g.getPlatform().name(), Collectors.counting()));
        int nbGamesByPlatform = gamesByPlatform.size();

        // Jeux par genre
        Map<String, Long> gamesByGenre = games.stream()
                .filter(g -> g.getUser().equals(user))
                .collect(Collectors.groupingBy(g -> g.getGenre().name(), Collectors.counting()));
        int nbGamesByGenre = gamesByGenre.size();


        // Mise à jour des données
        statistic.setUser(user);
        statistic.setNbTotalGames(nbTotalGames);
        statistic.setNbGamesNotStarted(nbGamesNotStarted);
        statistic.setNbGamesStarted(nbGamesStarted);
        statistic.setNbGamesFinished(nbGamesFinished);
        statistic.setNbGamesByPlateform(nbGamesByPlatform);
        statistic.setNbGamesByGenre(nbGamesByGenre);

        return statistic;
    }
}
