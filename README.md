# 비트캠프 숙제 공유
## 4조 팀원
- 김병주
- 김시표
- 서재환
- 이희승
- 조장호
  
## Github Organization 권한 설정
### your oranizations > organization 명 선택 > Settings > 왼쪽 메뉴 Memeber privileges > Base Permissions 선택

## Github 프로젝트 Merge 방법
1. 개인 브런치로 변경하여 개인 브런치에 다른 사람의 브런치들을 모두 merge 시킨다.
2. main 브런치로 변경하여 merge 시킨 브런치를 다시 merge 시킨다.

## gitbash 명령어
### 원격저장소로 연결되어 있는 원격저장소 확인 명령어
git remote -v
### 원격저장소에서 개인저장소(개인PC 드라이브 저장폴더)에 프로젝트 가져오는 법
1. git clone 원격저장소 URL
2. git pull 원격저장소 브랜치명 (브랜치명에 원격저장소에 있는 파일 및 폴더들을 merge 시킴)
### 개인저장소(개인PC 드라이브 저장폴더)와 원격저장소 update 상태 확인
- gitbash -> git status -> 빨간줄로 나오는 파일들 및 폴더들은 새로 commit 및 push 할 수 있는 것
- 소스트리 -> history 창으로 확인
### 현재 사용중인 브랜치명 확인
- gitbash -> git branch
- 소스트리 -> 브랜치명 왼쪽 동그라미 표시 확인
### 브랜치 변경
- gitbash -> git switch -c 브랜치명
- 소스트리 -> 브랜치명 더블클릭
### 브랜치 삭제
- gitbash -> git branch -d 브랜치명
- 소스트리 -> 브랜치명 오른쪽클릭 후 삭제
