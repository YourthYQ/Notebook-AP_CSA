package exam2013;

import java.util.*;

public class MusicDownloads {

    private List<DownloadInfo> downloadList;

    public MusicDownloads() {
        downloadList = new ArrayList<DownloadInfo>();
    }


    public DownloadInfo getDownloadInfo(String title) {

        for (int i = 0; i < downloadList.size(); i++) {
            if (title.equals(downloadList.get(i).getTitle())) {
                return downloadList.get(i);
            }
        }
        return null;

    }

    public void updateDownloads(List<String> titles) {

        for (int i = 0; i < downloadList.size(); i++) {
            for (int j = i + 1; j < downloadList.size(); j++) {
                if (downloadList.get(i).getTitle().equals(titles.get(j))) {
                    downloadList.get(i).incrementTimesDownloaded();
                }
                else if (!downloadList.get(i).getTitle().equals(titles.get(j))) {
                    downloadList.add(new DownloadInfo(titles.get(j)));
                }
            }
        }

    }

}
