
package com.moringaschool.android_ip_1.Models.FilmEndPoint;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.parceler.Generated;
import org.parceler.IdentityCollection;
import org.parceler.InjectionUtil;
import org.parceler.ParcelWrapper;
import org.parceler.ParcelerRuntimeException;

@Generated("org.parceler.ParcelAnnotationProcessor")
@SuppressWarnings({
    "unchecked",
    "deprecation"
})
public class DetailApiResponse$$Parcelable
    implements Parcelable, ParcelWrapper<com.moringaschool.android_ip_1.Models.FilmEndPoint.DetailApiResponse>
{

    private com.moringaschool.android_ip_1.Models.FilmEndPoint.DetailApiResponse detailApiResponse$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Creator<DetailApiResponse$$Parcelable>CREATOR = new Creator<DetailApiResponse$$Parcelable>() {


        @Override
        public DetailApiResponse$$Parcelable createFromParcel(android.os.Parcel parcel$$2) {
            return new DetailApiResponse$$Parcelable(read(parcel$$2, new IdentityCollection()));
        }

        @Override
        public DetailApiResponse$$Parcelable[] newArray(int size) {
            return new DetailApiResponse$$Parcelable[size] ;
        }

    }
    ;

    public DetailApiResponse$$Parcelable(com.moringaschool.android_ip_1.Models.FilmEndPoint.DetailApiResponse detailApiResponse$$2) {
        detailApiResponse$$0 = detailApiResponse$$2;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$0, int flags) {
        write(detailApiResponse$$0, parcel$$0, flags, new IdentityCollection());
    }

    public static void write(com.moringaschool.android_ip_1.Models.FilmEndPoint.DetailApiResponse detailApiResponse$$1, android.os.Parcel parcel$$1, int flags$$0, IdentityCollection identityMap$$0) {
        int identity$$0 = identityMap$$0 .getKey(detailApiResponse$$1);
        if (identity$$0 != -1) {
            parcel$$1 .writeInt(identity$$0);
        } else {
            parcel$$1 .writeInt(identityMap$$0 .put(detailApiResponse$$1));
            com.moringaschool.android_ip_1.Models.FilmEndPoint.Trailer$$Parcelable.write(InjectionUtil.getField(com.moringaschool.android_ip_1.Models.FilmEndPoint.Trailer.class, com.moringaschool.android_ip_1.Models.FilmEndPoint.DetailApiResponse.class, detailApiResponse$$1, "trailer"), parcel$$1, flags$$0, identityMap$$0);
            parcel$$1 .writeString(InjectionUtil.getField(java.lang.String.class, com.moringaschool.android_ip_1.Models.FilmEndPoint.DetailApiResponse.class, detailApiResponse$$1, "pushId"));
            if (InjectionUtil.getField(new InjectionUtil.GenericType<java.util.List<com.moringaschool.android_ip_1.Models.FilmEndPoint.Cast>>(), com.moringaschool.android_ip_1.Models.FilmEndPoint.DetailApiResponse.class, detailApiResponse$$1, "cast") == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(InjectionUtil.getField(new InjectionUtil.GenericType<java.util.List<com.moringaschool.android_ip_1.Models.FilmEndPoint.Cast>>(), com.moringaschool.android_ip_1.Models.FilmEndPoint.DetailApiResponse.class, detailApiResponse$$1, "cast").size());
                for (com.moringaschool.android_ip_1.Models.FilmEndPoint.Cast cast$$0 : InjectionUtil.getField(new InjectionUtil.GenericType<java.util.List<com.moringaschool.android_ip_1.Models.FilmEndPoint.Cast>>(), com.moringaschool.android_ip_1.Models.FilmEndPoint.DetailApiResponse.class, detailApiResponse$$1, "cast")) {
                    com.moringaschool.android_ip_1.Models.FilmEndPoint.Cast$$Parcelable.write(cast$$0, parcel$$1, flags$$0, identityMap$$0);
                }
            }
            parcel$$1 .writeString(InjectionUtil.getField(java.lang.String.class, com.moringaschool.android_ip_1.Models.FilmEndPoint.DetailApiResponse.class, detailApiResponse$$1, "year"));
            parcel$$1 .writeString(InjectionUtil.getField(java.lang.String.class, com.moringaschool.android_ip_1.Models.FilmEndPoint.DetailApiResponse.class, detailApiResponse$$1, "ratingVotes"));
            parcel$$1 .writeString(InjectionUtil.getField(java.lang.String.class, com.moringaschool.android_ip_1.Models.FilmEndPoint.DetailApiResponse.class, detailApiResponse$$1, "plot"));
            if (InjectionUtil.getField(new InjectionUtil.GenericType<java.util.List<java.util.List<java.lang.String>>>(), com.moringaschool.android_ip_1.Models.FilmEndPoint.DetailApiResponse.class, detailApiResponse$$1, "technicalSpecs") == null) {
                parcel$$1 .writeInt(-1);
            } else {
                parcel$$1 .writeInt(InjectionUtil.getField(new InjectionUtil.GenericType<java.util.List<java.util.List<java.lang.String>>>(), com.moringaschool.android_ip_1.Models.FilmEndPoint.DetailApiResponse.class, detailApiResponse$$1, "technicalSpecs").size());
                for (java.util.List<java.lang.String> list$$0 : InjectionUtil.getField(new InjectionUtil.GenericType<java.util.List<java.util.List<java.lang.String>>>(), com.moringaschool.android_ip_1.Models.FilmEndPoint.DetailApiResponse.class, detailApiResponse$$1, "technicalSpecs")) {
                    if (list$$0 == null) {
                        parcel$$1 .writeInt(-1);
                    } else {
                        parcel$$1 .writeInt(list$$0 .size());
                        for (java.lang.String string$$0 : list$$0) {
                            parcel$$1 .writeString(string$$0);
                        }
                    }
                }
            }
            parcel$$1 .writeString(InjectionUtil.getField(java.lang.String.class, com.moringaschool.android_ip_1.Models.FilmEndPoint.DetailApiResponse.class, detailApiResponse$$1, "length"));
            parcel$$1 .writeString(InjectionUtil.getField(java.lang.String.class, com.moringaschool.android_ip_1.Models.FilmEndPoint.DetailApiResponse.class, detailApiResponse$$1, "rating"));
            parcel$$1 .writeString(InjectionUtil.getField(java.lang.String.class, com.moringaschool.android_ip_1.Models.FilmEndPoint.DetailApiResponse.class, detailApiResponse$$1, "id"));
            parcel$$1 .writeString(InjectionUtil.getField(java.lang.String.class, com.moringaschool.android_ip_1.Models.FilmEndPoint.DetailApiResponse.class, detailApiResponse$$1, "title"));
            parcel$$1 .writeString(InjectionUtil.getField(java.lang.String.class, com.moringaschool.android_ip_1.Models.FilmEndPoint.DetailApiResponse.class, detailApiResponse$$1, "poster"));
        }
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.moringaschool.android_ip_1.Models.FilmEndPoint.DetailApiResponse getParcel() {
        return detailApiResponse$$0;
    }

    public static com.moringaschool.android_ip_1.Models.FilmEndPoint.DetailApiResponse read(android.os.Parcel parcel$$3, IdentityCollection identityMap$$1) {
        int identity$$1 = parcel$$3 .readInt();
        if (identityMap$$1 .containsKey(identity$$1)) {
            if (identityMap$$1 .isReserved(identity$$1)) {
                throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
            }
            return identityMap$$1 .get(identity$$1);
        } else {
            com.moringaschool.android_ip_1.Models.FilmEndPoint.DetailApiResponse detailApiResponse$$4;
            int reservation$$0 = identityMap$$1 .reserve();
            detailApiResponse$$4 = new com.moringaschool.android_ip_1.Models.FilmEndPoint.DetailApiResponse();
            identityMap$$1 .put(reservation$$0, detailApiResponse$$4);
            com.moringaschool.android_ip_1.Models.FilmEndPoint.Trailer trailer$$0 = com.moringaschool.android_ip_1.Models.FilmEndPoint.Trailer$$Parcelable.read(parcel$$3, identityMap$$1);
            InjectionUtil.setField(com.moringaschool.android_ip_1.Models.FilmEndPoint.DetailApiResponse.class, detailApiResponse$$4, "trailer", trailer$$0);
            InjectionUtil.setField(com.moringaschool.android_ip_1.Models.FilmEndPoint.DetailApiResponse.class, detailApiResponse$$4, "pushId", parcel$$3 .readString());
            int int$$0 = parcel$$3 .readInt();
            java.util.ArrayList<com.moringaschool.android_ip_1.Models.FilmEndPoint.Cast> list$$1;
            if (int$$0 < 0) {
                list$$1 = null;
            } else {
                list$$1 = new java.util.ArrayList<com.moringaschool.android_ip_1.Models.FilmEndPoint.Cast>(int$$0);
                for (int int$$1 = 0; (int$$1 <int$$0); int$$1 ++) {
                    com.moringaschool.android_ip_1.Models.FilmEndPoint.Cast cast$$1 = com.moringaschool.android_ip_1.Models.FilmEndPoint.Cast$$Parcelable.read(parcel$$3, identityMap$$1);
                    list$$1 .add(cast$$1);
                }
            }
            InjectionUtil.setField(com.moringaschool.android_ip_1.Models.FilmEndPoint.DetailApiResponse.class, detailApiResponse$$4, "cast", list$$1);
            InjectionUtil.setField(com.moringaschool.android_ip_1.Models.FilmEndPoint.DetailApiResponse.class, detailApiResponse$$4, "year", parcel$$3 .readString());
            InjectionUtil.setField(com.moringaschool.android_ip_1.Models.FilmEndPoint.DetailApiResponse.class, detailApiResponse$$4, "ratingVotes", parcel$$3 .readString());
            InjectionUtil.setField(com.moringaschool.android_ip_1.Models.FilmEndPoint.DetailApiResponse.class, detailApiResponse$$4, "plot", parcel$$3 .readString());
            int int$$2 = parcel$$3 .readInt();
            java.util.ArrayList<java.util.List<java.lang.String>> list$$2;
            if (int$$2 < 0) {
                list$$2 = null;
            } else {
                list$$2 = new java.util.ArrayList<java.util.List<java.lang.String>>(int$$2);
                for (int int$$3 = 0; (int$$3 <int$$2); int$$3 ++) {
                    int int$$4 = parcel$$3 .readInt();
                    java.util.ArrayList<java.lang.String> list$$3;
                    if (int$$4 < 0) {
                        list$$3 = null;
                    } else {
                        list$$3 = new java.util.ArrayList<java.lang.String>(int$$4);
                        for (int int$$5 = 0; (int$$5 <int$$4); int$$5 ++) {
                            list$$3 .add(parcel$$3 .readString());
                        }
                    }
                    list$$2 .add(list$$3);
                }
            }
            InjectionUtil.setField(com.moringaschool.android_ip_1.Models.FilmEndPoint.DetailApiResponse.class, detailApiResponse$$4, "technicalSpecs", list$$2);
            InjectionUtil.setField(com.moringaschool.android_ip_1.Models.FilmEndPoint.DetailApiResponse.class, detailApiResponse$$4, "length", parcel$$3 .readString());
            InjectionUtil.setField(com.moringaschool.android_ip_1.Models.FilmEndPoint.DetailApiResponse.class, detailApiResponse$$4, "rating", parcel$$3 .readString());
            InjectionUtil.setField(com.moringaschool.android_ip_1.Models.FilmEndPoint.DetailApiResponse.class, detailApiResponse$$4, "id", parcel$$3 .readString());
            InjectionUtil.setField(com.moringaschool.android_ip_1.Models.FilmEndPoint.DetailApiResponse.class, detailApiResponse$$4, "title", parcel$$3 .readString());
            InjectionUtil.setField(com.moringaschool.android_ip_1.Models.FilmEndPoint.DetailApiResponse.class, detailApiResponse$$4, "poster", parcel$$3 .readString());
            com.moringaschool.android_ip_1.Models.FilmEndPoint.DetailApiResponse detailApiResponse$$3 = detailApiResponse$$4;
            identityMap$$1 .put(identity$$1, detailApiResponse$$3);
            return detailApiResponse$$3;
        }
    }

}
