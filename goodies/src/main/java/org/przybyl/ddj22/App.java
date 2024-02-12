/*
 *  Copyright (C) 2024 Piotr Przybył
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package org.przybyl.ddj22;

import java.util.Random;

public class App {
    void main() {
        var l = Location.randomBeforeStatement();
        System.out.print(STR."Statements \{l.preposition()} \{l.reference()} ");
        new StatementsBeforeSuper("are so cool!");
    }
}

class StatementsBeforeSuper {
    StatementsBeforeSuper(String message) {
        System.out.println(message);
        super();
    }
}

record Location(String preposition, String reference) {
    static Random rand = new Random();
    static Location randomBeforeStatement() {
        String reference = switch (rand.nextInt(2)) {
            case 0 -> "super()";
            case 1 -> "this()";
            default -> throw new IllegalStateException("this is nuts");
        };
        return new Location("before", reference);
    }
}
