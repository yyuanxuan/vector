/**
 * Component of a library for handling spatial vector data.
 * Copyright (C) 2017 Andy Turner, CCG, University of Leeds, UK.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA.
 */
package uk.ac.leeds.ccg.andyt.vector.io;

import java.io.File;
import uk.ac.leeds.ccg.andyt.vector.core.Vector_Strings;

/**
 *
 * @author geoagdt
 */
public class Vector_Files {

    protected Vector_Strings vs;

    File Directory;
    File GridsDirectory;

    protected Vector_Files() {
    }

    public Vector_Files(File Directory) {
        this.vs = new Vector_Strings();
        this.Directory = Directory;
    }

    public final void setDirectory(File Directory) {
        this.Directory = Directory;
    }

    public final File getDirectory() {
        return Directory;
    }

    public final File getGridsDirectory() {
        if (GridsDirectory == null) {
            GridsDirectory = new File(
                    getDirectory(),
                    vs.getString_Grids());
        }
        return GridsDirectory;
    }
}
