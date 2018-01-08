/*
    rokirc-srv: A remote application that listens to an IRC server and generates Markov chains.
    Copyright (C) 2018  Joshua Trahan

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.

 */

import com.robut.rokrcsrv.RRCServer;

import java.io.IOException;

public class Driver {
    public static void main(String[] args){
        int port = Integer.parseInt(args[0]);
        String dbDirectory = args[1];

        RRCServer srv = new RRCServer(dbDirectory);
        try {
            srv.listen(port, "127.0.0.1");
        }
        catch (IOException e){
            System.err.printf("Exception trying to listen on port %d: %s%n", port, e);
        }


    }
}
