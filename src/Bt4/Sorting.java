package Bt4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        List<FootballTeam> lists = new ArrayList<>();
        lists.add(new FootballTeam(1, "Team A", 11, 20));
        lists.add(new FootballTeam(2, "Team B", 12, 15));
        lists.add(new FootballTeam(3, "Team C", 13, 30));
        lists.add(new FootballTeam(4, "Team D", 14, 10));

        System.out.println("\n ___ danh sach ban dau ___");
        mangBanDau(lists);

        System.out.println("\n ___ danh sach sap xep theo phuong thuc chen");
        List<FootballTeam> list1 = chen(lists);
        mangBanDau(list1);

        System.out.println("\n ___ danh sach sap xep theo lua chon ___ ");
        List<FootballTeam> list2 = luaChon(lists);
        mangBanDau(list2);

        System.out.println("\n ___ danh sach sap xep theo noi bot ___ ");
        List<FootballTeam> list3 = noiBot(lists);
        mangBanDau(list3);
    }

    public static List<FootballTeam> chen(List<FootballTeam> lists) {
        int n = lists.size();

        for (int i = 1; i < n; i++) {
            FootballTeam key = lists.get(i);
            int j = i - 1;

            while (j >= 0 && lists.get(j).getScore() < key.getScore()) {
                lists.set(j + 1, lists.get(j));
                j--;
            }

            lists.set(j + 1, key);
        }

        return lists;
    }

    public static List<FootballTeam> luaChon(List<FootballTeam> lists) {
        int n = lists.size();

        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (lists.get(j).getScore() > lists.get(maxIndex).getScore()) {
                    maxIndex = j;
                }
            }

            Collections.swap(lists, i, maxIndex);
        }

        return lists;
    }

    public static List<FootballTeam> noiBot(List<FootballTeam> lists) {
        int n = lists.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (lists.get(j).getScore() < lists.get(j + 1).getScore()) {
                    Collections.swap(lists, j, j + 1);
                }
            }
        }

        return lists;
    }

    public static void mangBanDau(List<FootballTeam> lists) {
        for (FootballTeam team : lists) {
            System.out.println(
                    "ID: " + team.getId() +
                            ", Name: " + team.getName() +
                            ", Score: " + team.getScore());
        }
    }

}
