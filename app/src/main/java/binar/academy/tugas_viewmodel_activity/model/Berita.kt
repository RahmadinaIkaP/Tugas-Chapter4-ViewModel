package binar.academy.tugas_viewmodel_activity.model

import android.os.Parcel
import android.os.Parcelable

data class Berita(
    val judul: String,
    val tanggalPublish: String,
    val namaJurnalis: String,
    val isiBerita: Int,
    val imgBerita: Int
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readString().toString(),
        parcel.readInt(),
        parcel.readInt()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(judul)
        parcel.writeString(tanggalPublish)
        parcel.writeString(namaJurnalis)
        parcel.writeInt(isiBerita)
        parcel.writeInt(imgBerita)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Berita> {
        override fun createFromParcel(parcel: Parcel): Berita {
            return Berita(parcel)
        }

        override fun newArray(size: Int): Array<Berita?> {
            return arrayOfNulls(size)
        }
    }
}
